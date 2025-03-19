public class Q3191 {
    class Solution {
        public int minOperations(int[] nums) {
            int n = nums.length;
            int k =3;
            
    
            int flips = 0;
            int flipcount =0;
            for(int i =0; i < n ; i++){
                if(i>=k && nums[i - k] ==2) { // was it flipped
                flipcount--;
                }
                if(flipcount %2 == nums[i]) {
                    if(i +k >n) {
                        return -1;
                    }
                    flipcount++;
                    nums[i] = 2;
                    flips++;
    
                } 
            }
            return flips;
        }
    }
}
