public class Q3330 {
    class Solution {
    public int possibleStringCount(String word) {
        int count  = 0;
        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == word.charAt(i - 1))
               count += 1;
        }
    return count + 1;
    }
}
}
