class Solution {
    public int findMin(int[] nums) {
        int start=0,end=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]<min) min=nums[mid];

            if(nums[mid]>=nums[start]){
                if(nums[start]<=nums[end]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            } else {
                if(mid>0 && nums[mid-1]<=nums[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }
        }
        return min;
    }
}