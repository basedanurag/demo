import java.util.HashMap;
import java.util.Map;

public class Q781 {
    class Solution {
        public int numRabbits(int[] answers) {
            Map<Integer, Integer> mp = new HashMap<>();
            for(int i : answers )mp.put(i, mp.getOrDefault(i,0)+1);
    
            int total =0;
            for(Map.Entry<Integer,Integer> p : mp.entrySet())
             total += Math.ceil((double)p.getValue()/ (p.getKey()+1))*(p.getKey()+1);
    
         return total;
        }
    }
}
