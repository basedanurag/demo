public class Q976 {
    class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 3; i >= 0; --i){
            int sum  = nums[i] + nums[i + 1];
            if ( sum  > nums[i + 2]){
                return sum + nums[i + 2];
            }
        }
        return 0;
    }
}
}
