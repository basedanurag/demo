import java.util.*;

public class Q7 {
    
    public static int solve(String s){

        int sum = 0;
       
        for(int i = 0; i < s.length(); i++){
            Map<Character , Integer> freq = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0)+ 1);
                int max = Integer.MIN_VALUE;
                int min =  Integer.MAX_VALUE;
                for(int val : freq.values()){
                    max = Math.max(max, val);
                    min = Math.min(min, val);
                }
                sum += (max - min);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(solve(s));
    }
}
