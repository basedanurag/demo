public class Q2503 {
   /*class Solution {
    int[][] directions = {{0,1}, {1,0},{0,-1}, {-1,0}};
    int bfs(int[][] grid, int val, int m, int n){
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{0,0});
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;
        int points = 0;
        while(!que.isEmpty()) {
            int N = que.size();

            while(N--> 0) {
                int[] curr = que.poll();
                int i = curr[0],j=curr[1];

                if(grid[i][j]> val) {
                    continue;
                }
                points++;
                for(int[] dirr : directions) {
                    int i_ = i + dirr[0];
                    int j_ = j+ dirr[1];
                    

                    if(i_ >=0 && i_ < m && j_ >=0 && j_ < n && !visited[i_][j_] && grid[i_][j_] < val){
                        que.offer(new int[]{i_,j_});
                        visited[i_][j_] = true;

                    }
                }
            }
        }
        return points;
    }
    public int[] maxPoints(int[][] grid, int[] queries) {
        int m = grid.length;
        int n = grid[0].length;

        int Q = queries.length;
        int[] result = new int[Q];

        for(int i =0; i < Q; i++){
            result[i] = bfs(grid, queries[i], m , n);
        }
        return result;
    }
} */
class Solution {
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
 
     public int[] maxPoints(int[][] grid, int[] queries) {
         int m = grid.length;
         int n = grid[0].length;
         int Q = queries.length;
         int[] result = new int[Q];
 
         int[][] sortedQ = new int[Q][2];
         for (int i = 0; i < Q; i++) {
             sortedQ[i][0] = queries[i];
             sortedQ[i][1] = i;
         }
         Arrays.sort(sortedQ, Comparator.comparingInt(a -> a[0]));
 
         PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
         boolean[][] visited = new boolean[m][n];
         int points = 0;
 
         pq.offer(new int[]{grid[0][0], 0, 0});
         visited[0][0] = true;
 
         for (int i = 0; i < Q; i++) {
             int queryValue = sortedQ[i][0];
             int idx = sortedQ[i][1];
 
             while (!pq.isEmpty() && pq.peek()[0] < queryValue) {
                 int[] top = pq.poll();
                 int x = top[1], y = top[2];
                 points++;
 
                 for (int[] dir : directions) {
                     int i_ = x + dir[0];
                     int j_ = y + dir[1];
                     if (i_ >= 0 && i_ < m && j_ >= 0 && j_ < n && !visited[i_][j_]) {
                         pq.offer(new int[]{grid[i_][j_], i_, j_});
                         visited[i_][j_] = true;
                     }
                 }
             }
             result[idx] = points;
         }
 
         return result;
     }
 } 
}
