class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1 = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                max1=Math.max(max1,count);
                count=0;
            } else {
                count++;
            }
        }
        return max1>count ? max1 : count;
    }
}