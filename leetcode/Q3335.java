import java.util.Arrays;

public class Q3335 {
    class Solution {
    private final int mod = 1_000_000_007;
    public int lengthAfterTransformations(String s, int t) {
        int[] dp = new int[t + 26];
        for (int i = 0; i < 26; i++) 
            dp[i] = 1;
        for (int i = 26; i < t + 26; i++)   
            dp[i] = (dp[i - 26] + dp[i - 25]) % mod;
            
        int ans = 0;
        for (char ch : s.toCharArray()) 
            ans = (ans + dp[ch - 'a' + t]) % mod;
        return ans;
    }
}
// DP method is down upper is simulation
class Solution2 {
    private static final int mod = 1000000007;

    public int lengthAfterTransformations(String s, int t) {
        int[] dp = new int[t + 26];
        Arrays.fill(dp, 1);
        for(int i = 26; i < t + 26; i++)
            dp[i] = (dp[i - 26] + dp[i - 25]) % mod;
        int ans = 0;
        for(char ch : s.toCharArray())
         ans = (ans + dp[ch - 'a' + t]) % mod;
        return ans;

    }
 // 3rd solution is also dp 
 class Solution3 {
    private final int mod = 1_000_000_007;
    public int lengthAfterTransformations(String s, int t) {
        int[] dp = new int[t + 26];
        for (int i = 0; i < 26; i++) 
            dp[i] = 1;
        for (int i = 26; i < t + 26; i++)   
            dp[i] = (dp[i - 26] + dp[i - 25]) % mod;
            
        int ans = 0;
        for (char ch : s.toCharArray()) 
            ans = (ans + dp[ch - 'a' + t]) % mod;
        return ans;
    }
}
}

}
