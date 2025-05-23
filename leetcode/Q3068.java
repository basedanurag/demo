public class Q3068 {
    class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
       long sum = 0;
       long cnt = 0;
       long node = Long.MAX_VALUE;
        for(int n : nums){
            int x = n ^ k;
            sum += Math.max(x,n);
            if(x > n) cnt++;
            node =  Math.min(node, Math.abs(n - x));

        }
        return sum - (cnt % 2 !=0 ? node : 0);

    }
}
}
