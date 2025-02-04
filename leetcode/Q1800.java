public class Q1800 {
   
        public int maxAscendingSum(int[] nums) {
            int n = nums.length;
            if(n == 0){
                return 0;
            }
            int maxlength  = nums[0];
            int sum = nums[0];
            
            for(int i = 1; i < n ;  i++ ) {
                // if ascending order 
                if(nums[i] > nums[i-1]){
                    sum += nums[i];
                }else { // if not ascending 
                    maxlength = Math.max(maxlength, sum);
                    sum = nums[i];
                }
                maxlength = Math.max(maxlength, sum);
            }
            return maxlength;
        }
    
}
