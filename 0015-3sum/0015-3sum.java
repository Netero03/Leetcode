class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i > 0 && nums[i]==nums[i-1]) continue;
            int k=n-1;
            int j=i+1;

            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0) {
                    list.add(List.of(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0) j++;
                else k--;
            }   

        }

        return list;
    }
}