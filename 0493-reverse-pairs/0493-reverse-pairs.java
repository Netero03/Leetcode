class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    static int mergeSort(int[] nums, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            count += mergeSort(nums, left, mid);
            count += mergeSort(nums, mid + 1, right);
            count += merge(nums, left, mid, right);
        }

        return count;
    }

    static int merge(int[] nums, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;

        // Step 1: Count reverse pairs separately
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long) nums[i] > 2 * (long) nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        // Step 2: Standard Merge Sort logic to actually sort the array
        int[] temp = new int[right - left + 1];
        int i = left, k = 0;
        int m = mid + 1;

        while (i <= mid && m <= right) {
            if (nums[i] <= nums[m]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[m++];
            }
        }

        while (i <= mid)
            temp[k++] = nums[i++];
        while (m <= right)
            temp[k++] = nums[m++];

        System.arraycopy(temp, 0, nums, left, temp.length);
        return count;
    }
}