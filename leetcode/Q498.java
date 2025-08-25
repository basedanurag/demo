import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q498 {
    class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n  = mat.length;
        int m  = mat[0].length;

        Map<Integer, List<Integer> > map = new HashMap<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                int key = i + j;
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(mat[i][j]);

            }
        }
        List<Integer> res = new ArrayList<>();
        boolean flip = true;
        for(int k = 0; k <= m + n - 2; k++ ){
            List<Integer> diagonal = map.get(k);
            if (diagonal == null) continue;

            if(flip) {
                Collections.reverse(diagonal);
            }
            res.addAll(diagonal);

            flip = !flip;
        }
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
    return result;
    }
}
}
