public class Q416 {
    class Solution {
        // this is bottom up approach 
        public boolean subsetSum(int[] nums, int S){
            int n = nums.length;
            boolean[][] t = new boolean[n+1][S+1];
            //impossible to get any sum if the array has no elements
            for(int col = 0; col < S+1; col++){
                t[0][col] = false;
            }
            // its always possible to get sum = 0
            for(int row  = 0; row < n +1; row++){
                t[row][0] = true;
            }
            for(int i =1; i < n+1; i++){
                for(int j = 1; j < S+1; j++){
                     if ( nums[i-1]<=j){
                        t[i][j] = t[i-1][j - nums[i-1]] || t[i-1][j]; // including || excluding 
                     } else{
                        t[i][j] = t[i-1][j]; // excluding because we cannot pick elemnent which is greater than target sum
                     }
                }
            }
            return t[n][S];
        }
        public boolean canPartition(int[] nums) {
            int sum =0;
            for(int x: nums){
                sum+= x;
            }
            if(sum %2 != 0)
            return false;
    
            sum = sum/2;
    
            return subsetSum(nums,sum);
        }
    }
}
