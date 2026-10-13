class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int zeroCount=0;
        int max=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==1){
                count++; 
            } else {
                zeroCount++;
                count++;
            }

            while(zeroCount > k){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
                count--;
            }

            max=Math.max(max,right-left+1);
        }
        return max;
    }
}