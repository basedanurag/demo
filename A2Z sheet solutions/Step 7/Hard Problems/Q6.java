public class Q6 {
    class Solution {
        int n;

        public boolean isPossible(int row, int col, char c, char[][] board) {
            for (int i = 0; i <= 9; i++) {
                if (board[row][i] == c)
                    return false;

                if (board[i][col] == c)
                    return false;

                if (board[3 * (row / 3) + (i / 3)][3 * (col / 3) + (i % 3)] == c)
                    return false;

            }
            return true;
        }

        public boolean helper(char[][] board) {
            // base case not required
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (board[row][col] == '.') {
                        for (char i = '1'; i <= '9'; i++) {
                            if (isPossible(row, col, i, board)) {
                                board[row][col] = i;
                                if (helper(board)) {
                                    return true;
                                }
                                board[row][col] = '.';
                            }
                        }
                        return false;
                    }
                }
            }
            return true;

        }

        public void solveSudoku(char[][] board) {
            n = board.length;
            helper(board);
        }
    }

    public static void main(String[] args) {

    }
}