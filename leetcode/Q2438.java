import java.util.ArrayList;
import java.util.List;

public class Q2438 {
    class Solution {
    int MOD = (int) (1e9 + 7);

    public int[] productQueries(int n, int[][] queries) {
        List<Long> power = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        // loop for checking which bet is set
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                power.add((long) (1 << i));
            }
        }

        // loop for taking the product as per query
        for (int query[] : queries) {
            int start = query[0];
            int last = query[1];
            long product = 1;
            for (int i = start; i <= last; i++) {
                product = (product * power.get(i)) % MOD;
            }
            res.add((int) product);
        }
        // convert results to array

        return res.stream().mapToInt(i -> i).toArray();
    }
}

}
