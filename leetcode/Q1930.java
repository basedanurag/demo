import java.util.HashSet;
import java.util.Set;

public class Q1930 {
   
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Set<Character> uniqueLetters = new HashSet<>();
        for(char ch : s.toCharArray()){
            uniqueLetters.add(ch);
        }
    int result = 0;
    
    for (char letter:uniqueLetters){
        int firstidx = -1;
        int lastidx = -1;
        for(int i=0 ; i<n ;i++){
            if (s.charAt(i) == letter){
                if(firstidx == -1){
                    firstidx = i;
                }
                lastidx =i;
            }
        }
        Set<Character> set = new HashSet<>();
        for(int mid = firstidx + 1; mid <= lastidx-1;mid++){
            set.add(s.charAt(mid));
        }
        result += set.size();
    } return result;
} 

}
