import java.util.Arrays;

public class Q1498 {
    class Solution {
    private static final int M = 1_000_000_007;
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
       int n  = nums.length;
       int[] power =  new int[n];
       power[0] = 1;
       for(int i = 1; i < n; i++){
        power[i] = (power[i - 1] * 2) % M;
       }

       int l =0, r = n - 1;

       int res = 0;

       while(l <= r){
        if(nums[l] + nums[r] <= target) {
            res = (res + power[r - l])% M;
            l++;
        }else {
            r--;
        }
       }
       return res;

    }
}
}
