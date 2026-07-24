class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxSum = 0;
        long windowSum = 0;
        Set<Integer> set = new HashSet<>();

        int left = 0;
        for (int right = 0; right < n; right++) {
            // If duplicate, shrink window from left
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            // Add current element
            set.add(nums[right]);
            windowSum += nums[right];

            // If window size exceeds k, shrink from left
            if (right - left + 1 > k) {
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            // If window size == k, update max
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}
