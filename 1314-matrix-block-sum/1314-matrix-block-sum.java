class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] answer=new int[m][n];
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int sum=0;
                for(int r=Math.max(0,i-k);r<=i+k && r<mat.length;r++ ){
                    for(int c=Math.max(0,j-k);c<=j+k && c<mat[0].length;c++){
                        sum += mat[r][c];
                    }
                }
                answer[i][j]=sum;
            }
        }

        return answer;
    }
}