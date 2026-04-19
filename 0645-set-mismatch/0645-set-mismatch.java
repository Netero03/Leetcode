class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] v=new int[n+1];
        int dup=0,mis=0;
        for(int i=0;i<n;i++){
            v[nums[i]]++;
        }

        for(int i=1;i<v.length;i++){
            if(v[i]==2) dup=i;
            if(v[i]==0) mis=i;
        }


        return new int[] {dup,mis};
    }
}