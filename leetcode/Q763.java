import java.util.ArrayList;
import java.util.List;

public class Q763 {
    class Solution {
        public List<Integer> partitionLabels(String s) {
        int n  = s.length();
        List<Integer> result = new ArrayList<>();
        // last ouucurance of each character
        int[]  lastIndex = new int[26];
        for(int i = 0; i < n; i++){
            lastIndex[s.charAt(i) - 'a'] = i;
    
        }
        int i =0;
        int start = 0;
        int end = 0;
        while(i<n) {
            end = Math.max(end,lastIndex[s.charAt(i)-'a']);
            if(i == end) {
                result.add(end - start +1);
                start = end + 1;
            }
            i++;
        }
        return result;
        
        }
    }
}
