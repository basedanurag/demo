public class Q2221{
    class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        for(int size = n - 1; size >= 1; size--){
            for(int i = 0; i < size; i++){
            nums[i] = (nums[i] + nums[i + 1]) % 10;
           
            }
        }
        return nums[0];
    }
}
    
}
