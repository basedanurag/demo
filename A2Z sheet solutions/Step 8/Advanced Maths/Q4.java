import java.util.ArrayList;
import java.util.List;

public class Q4 {
    class Solution {
        public ArrayList<Integer> primeFactors(int n) {
            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {

                    // add here for distinct prime numbers
                    while (n % i == 0) {
                        ans.add(i);
                        // add here for all prime numbers factors
                        n = n / i;
                    }
                }
            }

            if (n != 1)
                ans.add(n);
            return ans;

        }

        public List<List<Integer>> primeFactors(int[] queries) {
            ArrayList<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < queries.length; i++) {
                result.add(primeFactors(queries[i]));
            }

            return result;
        }
    }
}
