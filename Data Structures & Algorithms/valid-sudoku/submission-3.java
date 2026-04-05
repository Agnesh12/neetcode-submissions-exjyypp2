class Solution {
    public boolean isValid(char[][] board, int row, int col, char tempChar) {
        for(int index = 0; index < 9; index++) {
            if(board[row][index] == tempChar) {
                return false;
            }
            if(board[index][col] == tempChar) {
                return false;
            }
            if(board[3 * (row / 3) + index / 3][3 * (col / 3) + index % 3] == tempChar) {
                return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if(board[row][col] != '.') {
                    char tempChar = board[row][col];
                    board[row][col] = '.';
                    if(!isValid(board, row, col, tempChar)) {
                        return false;
                    }
                    board[row][col] = tempChar;
                }
            }
        }
        return true;
    }
}
