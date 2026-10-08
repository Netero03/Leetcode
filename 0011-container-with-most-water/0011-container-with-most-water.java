class Solution {
    public int maxArea(int[] height) {
        int low=0,high=height.length-1;
        int maxArea=Integer.MIN_VALUE;

        while(low<high){
            maxArea=Math.max(maxArea,Math.min(height[low],height[high])*(high-low));

            if(height[low]>height[high]){
                high--;
            } else if(height[low]<height[high]){
                low++;
            } else {
                high--;
                low++;
            }
        }

        return maxArea;
    }
}