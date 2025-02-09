import java.util.HashMap;
import java.util.Map;

public class Q2364 {
        public long countBadPairs(int[] nums) {
            int n = nums.length;
            long result = 0;
            Map<Integer, Integer> mp = new HashMap<>();
            for (int i =0; i< n ;i++) {
                int diff = nums[i]-i;
                int totalPairs =i;
                int goodpairs = mp.getOrDefault(diff, 0);
                result += (totalPairs - goodpairs);
                mp.put(diff,goodpairs +1);
    
    
            }
            
            return result;
        }
}
