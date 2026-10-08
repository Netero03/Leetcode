class Solution {
    public void moveZeroes(int[] nums) {
        int size=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                size++;
            } else {
                int temp=nums[i];
                nums[i]=0;
                nums[i-size]=temp;
            }
        }
    }
}