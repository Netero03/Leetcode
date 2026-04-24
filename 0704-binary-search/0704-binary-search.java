class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        if(n==1 && target==nums[0]) return 0;
        int m=0;
        for(int i=0;i<=n/2;i++ ,m++){
            if(nums[i]==target) return i;
            if(nums[n-m-1]==target) return n-m-1;
            
        }
        return -1;
    }
}