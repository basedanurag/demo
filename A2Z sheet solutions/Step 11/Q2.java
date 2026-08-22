import java.util.Collections;
import java.util.PriorityQueue;

public class Q2 {
    // kth smallest element
    public int kthSmallest(int[][] matrix, int k) {
        int n =  matrix.length;
        int m  =  matrix[0].length;
        PriorityQueue<Integer> maxheap =  new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                maxheap.offer(matrix[i][j]);

                if(maxheap.size() >k){
                    maxheap.poll();
                }
            }
        }
        return maxheap.poll();
    }
}
