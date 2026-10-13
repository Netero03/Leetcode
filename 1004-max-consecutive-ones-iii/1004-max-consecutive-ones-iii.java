class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int zeroCount=0;
        int max=0;
        int left=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zeroCount++; 
            }

            if(zeroCount > k){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
        }
        return n-left;
    }
}