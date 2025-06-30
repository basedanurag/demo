import java.util.Arrays;

public class Q594 {
    class Solution {
    public int findLHS(int[] nums) {
        //sorting 
        //use sliding window from index 0 and and index greater that that 
        //if the element diff is greater than 1 then move to the next index to  shrink the window

        Arrays.sort(nums);
        int i = 0; 
        int maxLen = 0;
        for(int j  = 0; j < nums.length; j++){
            while(nums[j] - nums[i] > 1 ){
                i++;
            }
            if(nums[j] - nums[i] == 1){
            maxLen  = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}
}
