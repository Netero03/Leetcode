class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==1) return strs[0];
        if(n==0) return "";

        int minlen=Integer.MAX_VALUE;
        for(String s : strs){
            minlen=Math.min(minlen,s.length());
        }

        String ans="";
        for(int i=0;i<minlen;i++){
            int j=1;
            char c=strs[0].charAt(i);
            while(j<n){
                if(strs[j].charAt(i)==c) j++;
                else break;
            }
            if(j==n) ans+=c;
            else break;
        }

        return ans;
    }
}