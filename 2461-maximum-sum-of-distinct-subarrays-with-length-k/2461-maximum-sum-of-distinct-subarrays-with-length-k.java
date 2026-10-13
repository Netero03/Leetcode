class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;

        if(n < k){
            return 0;
        }
        
        int left=0;
        Set<Integer> hs=new HashSet<>();
        long maxSum=0;
        long windowSum=0;
        for(int right=0;right<n;right++){
            
            while(hs.contains(nums[right])){
                hs.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            hs.add(nums[right]);
            windowSum+=nums[right];

            if(right-left+1 > k){
                hs.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            if(right-left+1 == k){
                maxSum=Math.max(maxSum,windowSum);
            }
        }

        return maxSum;
    }
}