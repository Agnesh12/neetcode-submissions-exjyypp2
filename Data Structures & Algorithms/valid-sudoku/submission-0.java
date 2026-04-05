class Solution {
    public boolean isValid(char[][] board, char current, int row, int col) {
        for(int index = 0; index < 9; index++) {
            if(board[row][index] == current) {
                return false;
            }
            if(board[index][col] == current) {
                return false;
            }
            if(board[3 * (row / 3) + index / 3][3 * (col / 3) + index % 3] == current) {
                return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
       for(int row = 0; row < board.length; row++) {
        for(int col = 0; col < board[0].length; col++) {
            char current = board[row][col];
            if(board[row][col] != '.') {
                board[row][col] = '.';
                if(!isValid(board, current, row, col)) {
                    return false;
                }
                board[row][col] = current;
            }
        }
       } 
       return true;
    }
}