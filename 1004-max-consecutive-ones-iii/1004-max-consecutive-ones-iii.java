class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxCnt = 0;
        int l=0;
        int zeroCnt=0;
        for (int r = 0; r < n; r++) {
            if(nums[r]==0){
                zeroCnt++;
            }
            while(zeroCnt>k){
                if(nums[l]==0) zeroCnt--;
                l++;
            }
            maxCnt = Math.max(maxCnt, r - l + 1);
        }

        return maxCnt;
    }
}