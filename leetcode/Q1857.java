import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Q1857 {
    class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int N = colors.length();
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] indegree = new int[N];
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            indegree[v]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        int[][] t = new int[N][26];
        for(int i  = 0; i < N; i++){
            if(indegree[i]== 0) {
                queue.offer(i);
                t[i][colors.charAt(i) - 'a'] =  1;
            }
        }
        int answer = 0;
        int countNode = 0;
        while(!queue.isEmpty()){
            int u = queue.poll();
            countNode++;
            for(int i = 0; i < 26; i++)
            {
                answer = Math.max(answer, t[u][i]);

            }
            List<Integer> neighbor = adj.getOrDefault(u, new ArrayList<>());
            for(int v : neighbor){
                for(int i = 0; i < 26; i++){
                        int val = t[u][i] + (colors.charAt(v) - 'a' == i ? 1 : 0);
                    t[v][i] = Math.max(t[v][i], val);
                }

                indegree[v]--;
                if (indegree[v] == 0) {
                    queue.offer(v);
                }
            }
        }

        return countNode < N ? -1 : answer;
    }
}
}
