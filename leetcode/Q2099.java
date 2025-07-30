import java.util.Arrays;
import java.util.Comparator;

public class Q2099 {
    class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n  =  nums.length;
        if( k == n)
        return nums;

        int[][] pairs = new int[n][2];
        for(int i = 0; i < n; i++){
            pairs[i][0] = i;// index store
            pairs[i][1] = nums[i]; // value

        }// sort in descending order
        Arrays.sort(pairs,(a,b) -> Integer.compare(b[1], a[1]));
        //sort the top k by index to maintain the order
        Arrays.sort(pairs, 0, k , Comparator.comparingInt(a -> a[0]));

        int[] result  = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = pairs[i][1];
        }

        return result;
    }
}
}
