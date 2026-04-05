class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ColSize = matrix.length;
        int RowSize = matrix[0].length;
        int Left = 0;
        int Right = ColSize * RowSize - 1;
        while(Left <= Right) {
            int Mid = Left + (Right - Left) / 2;
            int Row = Mid / RowSize;
            int Col = Mid % RowSize;

            if(matrix[Row][Col] == target) {
                return true;
            }
            else if(matrix[Row][Col] < target) {
                Left = Mid + 1;
            }
            else {
                Right = Mid - 1;
            }
        }
        return false;
    }
}
