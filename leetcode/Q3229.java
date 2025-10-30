public class Q3229 {
    class Solution {
    public long minimumOperations(int[] nums, int[] target) {
       int n  = target.length;
       long result  =  0;
       int curr = 0;
       int prev = 0;

       for(int i = 0; i < n; i++){
            curr = target[i] - nums[i];
            //check for the sign change
            if((curr < 0 && prev > 0) || (curr >  0 && prev < 0)){
                result += Math.abs(curr);
            }
                //check for the increment 
            else if(Math.abs(curr) > Math.abs(prev)){
                    result += Math.abs(curr - prev);
            }
            prev =  curr;
       } 
       return result;
    }
}
}
