import java.util.ArrayList;
import java.util.List;

public class Q118 {
    class Solution {
        //this is the solution for pascle triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>(i + 1);
            for(int j = 0; j <=i; j++){
                if ( j == 0 || j  == i){
                    row.add(1);
                } else{
                    int num = res.get(i - 1).get(j) + res.get(i - 1).get(j - 1);
                    row.add(num);
                }
            }
            res.add(row);
        }
        return res;
    }
}
}
