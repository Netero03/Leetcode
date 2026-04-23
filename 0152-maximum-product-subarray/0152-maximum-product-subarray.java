class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int i=0;
        int maxSum=Integer.MIN_VALUE;
        while(i<n){
            int sum=1;
            for(int j=i;j<n;j++){
                sum= sum*nums[j];
                if(maxSum < sum ) maxSum=sum;
            }
            i++;
        }
        return maxSum;
    }
}