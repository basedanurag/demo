public class Q3100 {
    class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
            int consumeBottles = 0;
        while(numBottles >= numExchange){
            consumeBottles += numExchange;
            numBottles -= numExchange;
            numExchange++;
            numBottles++; 
        }

        return consumeBottles +numBottles;
    }
}
}
