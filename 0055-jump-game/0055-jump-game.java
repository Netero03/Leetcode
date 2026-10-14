class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1) return true;
        int max=0;

        for(int i=0;i<n;i++){
            if(i > max) return false;
        
            max=Math.max(max,i + nums[i]);
            
            if(max>=nums.length-1){
                return true;
            }
        }
        return true;
    }
}