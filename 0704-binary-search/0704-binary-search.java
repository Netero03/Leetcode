class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int m=0;
        for(int i=0;i<n;i++ ,m++){
            if(nums[i]==target) return i;
            if(nums[n-m-1]==target) return n-m-1;
            
        }
        return -1;
    }
}