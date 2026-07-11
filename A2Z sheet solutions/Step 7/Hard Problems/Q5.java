import java.util.Arrays;

public class Q5 {
    // checking if possible or not 
    public static  boolean isSafe(int Node , int[] colors, boolean [][] graph, int N , int col){
        for (int k = 0; k < N; k++) {
            // Check if adjacent node has the same color
            if (k != Node && graph[k][Node] && colors[k] == col) {
                return false;
            }
        }
        return true;
    }
    //helper function for backtracking
    public static boolean helper(int Node , int[] color, int m , int N , boolean[][] graph){
        if(Node == N) return true;

        for(int col = 1; col <= m; col++){
            if(isSafe(Node,color,graph, N,col )){

                color[Node] = col;
               if( helper( Node + 1, color, m, N, graph)) return true;
                color[Node] = 0;
            }
        }
        return false;
    }
     public static boolean graphColoring(boolean[][] graph, int m, int N) {
        int[] color = new int[N];
        Arrays.fill(color, 0);
        // Start solving from node 0
        if (helper(0, color, m, N, graph)) return true;
        return false;
    }
    public static void main(String[] args) {
        
    }
}
