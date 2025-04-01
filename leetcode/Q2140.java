public class Q2140 {
    class Solution {
        // this is a bottom up dp question
        public long mostPoints(int[][] questions) {
            int n = questions.length;
            long[] dp = new long[n+1];
    
            for(int i = n-1; i>=0 ; i--) {
                dp[i] = Math.max(questions[i][0] + (i + 1 + questions[i][1] < n ? dp[i+1+ questions[i][1]] :0),dp[i+1]);
            }
            return dp[0];
        }
    }
}
