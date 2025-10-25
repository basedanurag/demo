public class Q1716 {
    class Solution {
    public int totalMoney(int n) {
        int terms = n /7; // gives the completed weeks
        
        int first = 28;
        int last = 28 + (terms - 1)* 7; // last term AP formulla 
        // a + (n - 1) * d;

        int result = terms * ( first + last)/ 2;

        int startMoney = 1 + terms;

        for(int day = 1; day <= (n % 7); day++){
            result += startMoney;
            startMoney++;
        }
        return result;
    }
}
}
