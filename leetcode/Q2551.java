import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2551 {
    class Solution {
        public long putMarbles(int[] weights, int k) {
            int n = weights.length;
            // create a new list of n-1 size to store the pair sum
            List<Integer> pairSum = new ArrayList<>();
    
            for(int i = 0; i < n-1; i++){
             pairSum.add(weights[i]  + weights[i+1]);
            }
            //sum of marbel weights
            Collections.sort(pairSum);
            long maxSum =0;
            long minSum =0;
    
            for(int i =0; i < k-1; i++){
    
                minSum += pairSum.get(i);
                maxSum += pairSum.get(n - i - 2);
    
            }
            return maxSum - minSum;
        }
    }
}
