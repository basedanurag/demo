public class Q1935 {
    class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean [] broken = new boolean[26];
        for(char c : brokenLetters.toCharArray()){
            broken[c - 'a'] = true;
        }
        int res = 0;
        boolean foundBroken = false;
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (c == ' '){
                if (!foundBroken){
                    res++;
                }
                foundBroken = false;
            }else if( broken[c - 'a']){
                foundBroken = true;
            }
        }
        if (!foundBroken){
            res++;
        }
        return res;
    }
}
}
