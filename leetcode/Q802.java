import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q802 {
        public List<Integer> eventualSafeNodes(int[][] graph) {
            int V = graph.length;
            List<List<Integer>> adj = new ArrayList<>();
    
            for(int i =0 ; i<V ; i++) {
                adj.add(new ArrayList<>());
    
            }
            Queue<Integer> queue = new LinkedList<>();
            int[] indegree = new int[V];
            
            //1. create reverse graph and calculation indegree
            for(int u = 0 ;  u < V; u++){
                for(int v: graph[u]){
                    adj.get(v).add(u);
                    indegree[u]++;
                }
            }
            // 2. Fill queue with nodes having indegree 0
            for(int i =0; i<V; i++){
                if (indegree[i]==0) {
                    queue.add(i);
                    
                }
            }
            // 3. Simple BFS
            boolean[] safe = new boolean[V];
            while(!queue.isEmpty()) {
                int u = queue.poll();
                safe[u] = true;
                for(int v : adj.get(u)){
                    indegree[v]--;
                    if(indegree[v]==0) {
                        queue.add(v);
                    
                    }
                }
            }
            List<Integer> safeNodes = new ArrayList<>();
            for(int i =0; i<V; i++) {
                if (safe[i]) {
                    safeNodes.add(i);
                }
            }
            return safeNodes;
    
        }
    
}
