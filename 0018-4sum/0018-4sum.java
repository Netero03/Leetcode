class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int l = n - 1; l > i + 2; l--) {

                if (l < n - 1 && nums[l] == nums[l + 1])
                    continue;
                int j = i + 1;
                int k = l - 1;

                while (j < k) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum < target) {
                        j++;
                    } else if (sum > target) {
                        k--;
                    } else {
                        list.add(List.of(nums[i], nums[j], nums[k], nums[l]));
                        j++;
                        k--;
                        while (j < k && nums[j] == nums[j - 1])
                            j++;
                        while (j < k && nums[k] == nums[k + 1])
                            k--;
                    }
                }
            }
        }
        return list;
    }
}