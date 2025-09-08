public class Q1317 {
    class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = n;
        int b =  0;
        int placeVal = 1;
        while( n > 1){
            int take = 1;
            if(n % 10 == 1){
                take = 2;
            }
            a = a - take * placeVal;
            b = b + take * placeVal;
            
            n = (n-take)/10;

            placeVal *= 10;
        }
        return new int[] {a,b};
    }
}
}
