class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxCnt = 0;

        for (int i = 0; i < n; i++) {
            int zero = 0;

            for (int j = i; j < n; j++) {
                if (nums[j] == 0) {
                    zero++;
                }
                if (zero > k) {
                    break;
                }
                maxCnt = Math.max(maxCnt, j - i + 1);
            }
        }

        return maxCnt;
    }
}