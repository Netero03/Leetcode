class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        int left=0,right=0;
        Map<Character,Integer> hm=new HashMap<>();

        while(right<n){
            char c=s.charAt(right);

            if(hm.containsKey(c) ){
                left=Math.max(left,hm.get(c)+1);
            }

            hm.put(c,right);
            max=Math.max(max,right - left + 1);
            right++;
        }

        return max;
    }
}