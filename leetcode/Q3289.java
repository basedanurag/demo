import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q3289 {
    class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer>  count = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for(int x : nums){
            int c  = count.getOrDefault(x, 0) +1;
                    //key and value  
            count.put(x, c);
            if(c > 1){
                res.add(x);
            }
        }
       return res.stream().mapToInt(Integer :: intValue).toArray();
    }
}
}
