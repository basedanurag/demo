import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {
    public boolean isSafe(int row, int col, char board[][]) {
        int temprow = row;
        int tempcol = col;
        // checking for upper left diagonal
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q')
                return false;

            row--;
            col--;
        }
        row = temprow;
        col = tempcol;
        // left side of the Queen column
        while (col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
        }
        // lower diagonal checking
        while (row <= board.length || col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row++;
            col--;
        }

        return true;
    }

    public void solve(int col, char board[][], List<List<String>> result, int n) {
        // basee case done
        if (col == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                temp.add(new String(board[i]));
            }
            result.add(temp);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(i, col, board)) {
                board[i][col] = 'Q';
                solve(col + 1, board, result, n);
                board[i][col] = '.';
            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
       
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(0, board, result, n);
        return result;
    }

    public static void main(String[] args) {

    }
}