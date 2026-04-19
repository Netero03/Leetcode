class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;

        int actualSum= (n*(n+1))/2;
        int arraySum=0;
        int uniqueSum=0;

        Set<Integer> s=new HashSet<>();

        for(int a:nums){
            arraySum+=a;
        }

        for(int a:nums){
            s.add(a);
        }

        for(int a : s){
            uniqueSum+=a;
        }
        int dup=arraySum-uniqueSum,mis=actualSum-uniqueSum;

        return new int[] {dup,mis};
    }
}