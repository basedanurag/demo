public class Q2110 {
    class Solution {
    public long getDescentPeriods(int[] prices) {
        long count = 1;
        long result = 1;
        for(int i = 1; i < prices.length; ++i){
            if(prices[i - 1] - prices[i] == 1)
                count++;
            
            else 
                count = 1;
            
            result += count;
        }
        return result;
    }
}
}
