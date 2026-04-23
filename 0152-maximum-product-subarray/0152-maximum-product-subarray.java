class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int i=0;
        int maxProduct=Integer.MIN_VALUE;
        while(i<n){
            int product=1;
            for(int j=i;j<n;j++){
                product= product*nums[j];
                if(maxProduct < product ) maxProduct=product;
            }
            i++;
        }
        return maxProduct;
    }
}