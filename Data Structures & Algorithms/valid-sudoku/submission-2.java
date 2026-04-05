class Solution {
    public boolean isValid(char[][] board, int row, int col, char currentChar) {
        for(int index = 0; index < 9; index++) {
            if(board[index][col] == currentChar) {
                return false;
            }
            if(board[row][index] == currentChar) {
                return false;
            }
            if(board[3 * (row / 3) + index / 3][3 * (col / 3) + index % 3] == currentChar) {
                return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if(board[row][col] != '.') {
                    char currentChar = board[row][col];
                    board[row][col] ='.';
                    if(!isValid(board, row, col, currentChar)) {
                        return false;
                    }
                    board[row][col] = currentChar;
                }
            }
        }
        return true;
    }
}
