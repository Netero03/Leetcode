class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        double n=x/2;

        if(n == 2) return 2;

        for(double i=2;i<=n;i++){
            if(i*i==x) return (int) i;
            else if(i*i > x) return (int) i-1;
        }
        return 1;
    }
}