import java.util.HashMap;
import java.util.Map;

public class Q1726 {
    
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        int tuples = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i =0; i< n ; i++) {
            for(int j=i+1; j< n; j++) {
                int p = nums[i]*nums[j];
                mp.put(p,mp.getOrDefault(p,0)+1);
            }
        }
        for (int freq : mp.values()){
            tuples +=  (freq * (freq-1))/2;

        }
        return tuples *8;
        
    }
}

