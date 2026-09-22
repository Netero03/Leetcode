class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int targetRow=-1;

        int top=0,bottom=m-1;

        while(top <= bottom){
            int mid=top + (bottom-top)/2;

            if(matrix[mid][0]==target){
                return true;
            } else if (matrix[mid][0] > target){
                bottom = mid-1;
            } else if (matrix[mid][0] < target){
                top = mid + 1;
                targetRow=mid;
            }
        }

        if(targetRow==-1) return false;

        int left=0,right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(matrix[targetRow][mid] == target){
                return true;
            } else if(matrix[targetRow][mid] > target){
                right = mid - 1;
            } else if(matrix[targetRow][mid] < target){
                left = mid + 1;
            }

        }

        return false;

    }
}