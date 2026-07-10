public class Q2 {
    int m, n;

    public boolean helper(int index, String word, int i, int j, char[][] board) {
        // base case
        if (index == word.length()) return true;

        if (i < 0 || j < 0 || i >= m || j >= n) {
            return false;
        }
        if (board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '$'; // visited
        boolean result = 
         helper(index + 1, word, i, j + 1, board) || // right
         helper(index + 1, word, i + 1, j, board) || // down
         helper(index + 1, word, i, j - 1, board) ||  // left
         helper(index + 1, word, i - 1, j, board);  // up


        board[i][j] = temp;

        return result;
    }

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && helper(0, word, i, j, board)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
