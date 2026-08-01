class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l=0;
        int zeroCnt=0;
        for (int r = 0; r < n; r++) {
            if(nums[r]==0){
                zeroCnt++;
            }
            if(zeroCnt>k){
                if(nums[l]==0) zeroCnt--;
                l++;
            }
            
        }

        return n - l;
    }
}