public class Q1752 {
        public boolean check(int[] nums) {
            int n = nums.length;
            int x = 0;
            for(int i = 0; i < n ; i++) {// just chek the highest peak of the array and then return the ans
                if ( nums[i]>nums[(i+1)%n]){
                    x++;
                } 
            }
            return x <= 1;
        }

}
