public class Q1518 {
    class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consumeBottles = 0;
        while(numBottles >= numExchange){
            consumeBottles += numExchange;
            numBottles -= numExchange;

            numBottles++; 
        }

        return consumeBottles +numBottles;
    }
}
}
