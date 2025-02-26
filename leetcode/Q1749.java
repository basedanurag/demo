public class Q1749 {
    class Solution {
        public int maxAbsoluteSum(int[] nums) {
            int n = nums.length;
            int maxSum = nums[0];
            int minSum = nums[0];
            int currSumMax = nums[0];
            int currSumMin = nums[0];
    
            for (int i =1 ; i < n; i++) {
                // kadanes algo for max sum subarray
                currSumMax = Math.max(nums[i], currSumMax + nums[i]);
                maxSum = Math.max(maxSum, currSumMax);
                //kadanes algo for min sum subarray
                currSumMin = Math.min(nums[i], currSumMin + nums[i]);
                minSum = Math.min(minSum, currSumMin);
            }
            return Math.max(maxSum, Math.abs(minSum));
    
        }
    }
}
