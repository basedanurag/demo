public class Q2270 {
        public int waysToSplitArray(int[] nums) {
            int i;
            long leftsum = 0;
            long rightsum = 0;
            long sum =0 ;
            int count = 0;
            int n = nums.length;
            for(int num:nums){
            sum += num;
            }
    
            for (i=0;i<n-1;i++){
                leftsum += nums[i];
                rightsum = sum -leftsum;
                if (leftsum>=rightsum){
                    count ++;
                }
            } 
            return count;
        } 
    
}
