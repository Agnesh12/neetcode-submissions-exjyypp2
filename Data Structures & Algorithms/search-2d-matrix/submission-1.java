class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int Left = 0;
        int Right = matrix.length * matrix[0].length - 1;
        while(Left <= Right) {
            int Mid = Left + (Right - Left) / 2;
            int Row = Mid / matrix[0].length;
            int Col = Mid % matrix[0].length;
            if(matrix[Row][Col] == target) {
                return true;
            }
            else if(matrix[Row][Col] > target) {
                Right = Mid - 1;
            }
            else {
            Left = Mid + 1;
            }
        }
        return false;
    }
}
