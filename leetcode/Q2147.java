import java.util.ArrayList;
import java.util.List;
public class Q2147 {
    class Solution {
    final int M =  1000000007;
    public int numberOfWays(String corridor) {
        int n = corridor.length();
        List<Integer> posS = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(corridor.charAt(i) == 'S'){
                posS.add(i);
            }

        }
        if(posS.size() %2 != 0 || posS.size() == 0){
            return 0;
        }
        long result =  1;
        int end_idx_prev = posS.get(1);
        for(int i = 2; i < posS.size(); i+=2){
            int length =  posS.get(i) - end_idx_prev;
            result = ( result * length) % M;
            end_idx_prev = posS.get(i + 1);
        }
        return (int) result;
    }
}
}
