import java.util.ArrayList;
import java.util.Collections;

public class Q4 {

      int m, n;

    public void helper(String s, int i, int j, int[][] board,ArrayList<String> result ) {
        // base case
        if (i == (m - 1) && j == (n - 1)) {
            
            result.add(s);
            
            return ;
        }

        if (i < 0 || j < 0 || i >= m || j >= n) {
            return ;
        }
        if(board[i][j] == 0 || board[i][j] == -1){
            return;
        }
        

        int  temp = board[i][j];
        board[i][j] = -1; // visited
        
         helper(s + 'R', i, j + 1, board,result); // right
         helper(s + 'D', i + 1, j, board,result); // down
         helper(s + 'L', i, j - 1, board,result);  // left
         helper(s + 'U', i - 1, j, board,result);  // up


        board[i][j] = temp;

    }

    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        m = maze.length;
        n= maze[0].length;
        if(n == 0 ) return result;
        helper("",0,0,maze, result);
        Collections.sort(result);
        return result ;
    }

    public static void main(String[] args) {

    }
}
