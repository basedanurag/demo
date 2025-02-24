import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q2467 {
    class Solution {
        Map<Integer, List<Integer> > adj = new HashMap<>(); 
        Map<Integer, Integer> bobmap = new HashMap<>();
        int aliceincome; 
        boolean DFSbob(int curr, int t, boolean[] visited)  {
            visited[curr] = true;
            bobmap.put(curr, t);
            if (curr == 0) {
                return true; //  target reached
            }
            for(int ngbr : adj.getOrDefault(curr, new ArrayList<>()) ) {
              if(!visited[ngbr]) {
                if(DFSbob(ngbr, t+1, visited)) {
                    return true;
    
                }
              }  
            }
            bobmap.remove(curr);
            return false ;
        }
        void DFSalice(int curr, int t,int income, boolean[] visited, int[] amount) {
            visited[curr] = true;
            if(!bobmap.containsKey(curr) || t<bobmap.get(curr)) {
                income += amount[curr];
            }else if(t==bobmap.get(curr) ){
                income += (amount[curr]/2);
            }
            if(adj.getOrDefault(curr, new ArrayList<>()).size()==1 && curr != 0) {
                aliceincome = Math.max(aliceincome, income);
            }
             /*
                {1} -> (2, 3)
                2 -> 1
                3 -> 1,....
                (1) ---- (2)
                 |
                 |
                 (3)------.....
            */
        
            for(int ngbr : adj.getOrDefault(curr, new ArrayList<>())) {
                if(!visited[ngbr]) {
                    DFSalice(ngbr, t + 1, income, visited, amount);
                }
            }
        }
        public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
            int n = amount.length; // n nodes ( 0 to n-1)
            aliceincome = Integer.MIN_VALUE;
            for(int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
                adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
            }
            // dfs on bob side 
            int time =0;
            boolean[] visited = new boolean[n];
            DFSbob(bob, time, visited);
            // dfs on alice 
            int income =0;
            Arrays.fill(visited, false);
            DFSalice(0,0, income, visited, amount);
    
            return aliceincome;
            
        }
    }
}
