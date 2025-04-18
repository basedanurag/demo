import java.util.HashSet;

public class Q1980 {
   
        public String findDifferentBinaryString(String[] nums) {
            HashSet<Integer> set = new HashSet<>();
            
            for (String num : nums) {
                set.add(Integer.parseInt(num, 2));
            }
            
            int n = nums.length;
            
            String result = "";
            
            for (int number = 0; number <= n; number++) {
                if (!set.contains(number)) {
                    result = Integer.toBinaryString(number);
                    while (result.length() < n) { //to make till length n
                        result = "0" + result;
                    }
    
                    return result;
                }
            }
            
            return "";
        }
    
}
