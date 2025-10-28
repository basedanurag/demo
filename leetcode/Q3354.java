public class Q3354 {
    class Solution {
    public int countValidSelections(int[] nums) {
        int n =  nums.length;
        
        int currSum = 0;
        int total = 0;
        int result =0;
        for(int x : nums){
            total += x;
        }
        for(int i =0; i < n; i++){
            currSum += nums[i];
            int left = currSum;
            int right = total -  currSum;
            
            if (nums[i] != 0 )
            continue;

            if(left == right)
            result +=2;

            if(Math.abs(left - right) == 1)
            result +=1;

        }
    return result;
    }
}
}
