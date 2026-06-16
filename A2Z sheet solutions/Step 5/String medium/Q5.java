import java.util.*;
// Example 1:
// Input:
//  s = "pqpqs", k = 2  
// Output:
//  7  
// Explanation:
//   All substrings with exactly 2 distinct characters:  
// "pq", "pqp", "pqpq", "qp", "qpq", "pqs", "qs"  
// Total = 7.

// Example 2:
// Input:
//  s = "abcbaa", k = 3  
// Output:
//  5  
// Explanation:
//   All substrings with exactly 3 distinct characters:  
// "abc", "abcb", "abcba", "bcba", "cbaa"  
// Total = 5.

public class Q5{
    public static int helper(String s, int k){
        int left  =0; // left ponter of window
        int res  = 0;
        Map<Character, Integer> freq  = new HashMap<>();

        for(int right = 0 ; right < s.length(); right++){
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0)+ 1); // holds the frequency

            while(freq.size() > k){
                Character leftCharacter =  s.charAt(left);
                freq.put(leftCharacter, freq.get(leftCharacter) - 1);
                if(freq.get(leftCharacter) == 0) freq.remove(leftCharacter);
                left++;
            }
            res += (right - left + 1);

        }
        

        return res;
    }

    public static int solve(String s, int k){
        // i am thinking about sliding window approach here 

        return helper(s, k) - helper(s, k - 1);
    } 
    public static void main(String[] args) {
        String s  = "abcbaa";     // res = 0 , 1 , 2 , 3 , 4 , 
        int k = 3;
        System.out.println(solve(s,k));
    }
}