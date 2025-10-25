public class Q1550 {
    class Solution {
        public boolean threeConsecutiveOdds(int[] arr) {
            if(arr.length < 3)
            return false;
            int count  = 0;
            for(int x : arr){
                if((x & 1) == 1) {
                    count++;
                    if(count >= 3) return true;
                }else {
                    count = 0;
                }
            }
            return false; 
        }
    }
}
