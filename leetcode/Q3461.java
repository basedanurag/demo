public class Q3461 {
    class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        char[] sArr= s.toCharArray();

        for(int i = 1; i <= n - 2; i++){
            for(int j  = 0; j <= n - 1 - i; j++){
                int dig1 = sArr[j] - '0';
                int dig2 = sArr[j + 1] - '0';
                sArr[j] = (char)(((dig1 + dig2)%10) + '0');

            }
        }
        return sArr[0] == sArr[1];
    }
}
}
