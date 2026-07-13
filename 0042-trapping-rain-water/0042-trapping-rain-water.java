class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int start = 0,end = n-1 ;
        int totalWater = 0;
        int leftMax=0,rightMax=0;
        while (start<end) {
            leftMax=Math.max(leftMax,height[start]);
            rightMax=Math.max(rightMax,height[end]);

            if(leftMax < rightMax){
                totalWater += leftMax - height[start];
                start++;
            } else {
                totalWater += rightMax - height[end];
                end--;
            }
        }

        return totalWater;
    }
}