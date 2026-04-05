class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int Left = 0;
        int Right = (matrix.length * matrix[0].length) - 1;
        while(Left <= Right) {
            int Mid = Left + (Right - Left) / 2;
            int Rows = Mid / matrix[0].length;
            int Cols = Mid % matrix[0].length;
            if(matrix[Rows][Cols] == target) {
                return true;
            }
            else if(matrix[Rows][Cols] > target) {
                Right = Mid - 1;
            }
            else {
                Left = Mid + 1;
            }
        }
        return false;
        
    }
}
