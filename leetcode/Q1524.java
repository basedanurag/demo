public class Q1524 {
    class Solution {
        public int numOfSubarrays(int[] arr) {
            int n = arr.length;
            int count = 0;
            int M = (int)1e9 + 7;
            int odd =0;
            int even = 1;
            int sum =0;
             for (int i =0; i < n; i++) {
                sum += arr[i];
                if(sum%2 !=0) { // odd + even = odd
                    count = (count + even )% M;
                    odd++;
                }else { // even + odd = odd
                    count  =  (count + odd) % M; 
                    even++;
                }
             }
             return count;
    
        }
    }
}
