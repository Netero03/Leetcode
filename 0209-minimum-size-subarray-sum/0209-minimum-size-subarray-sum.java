class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int cnt=Integer.MAX_VALUE;
        int sum=0;

        while(r<nums.length){
            sum+=nums[r];

            while(sum >= target){
                cnt=Math.min(cnt,r-l+1);
                sum-=nums[l];
                l++;
            }

            r++;
        }

        return cnt != Integer.MAX_VALUE ? cnt : 0 ;
    }
}