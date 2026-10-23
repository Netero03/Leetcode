class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0;
        int cnt=0;

        Map<Integer,Integer> map=new HashMap<>();

        for(int r=0;r<n;r++){   
             map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

             while(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
            }  

            cnt=Math.max(cnt,r-l+1);
        }
        return cnt;
    }
}