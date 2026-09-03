class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left=0;
        int right=nums.length-1;

        if(nums[0]>target) return 0;

        while(left<=right){
            int mid=left + (right-left)/2;

            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]>target ){
                if( mid > 0 && nums[mid-1]<target) return mid;
                right=mid-1;
            } else if(nums[mid]<target){
                left=mid+1;
            }
            
        }

        return nums.length;
    }
}