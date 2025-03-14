public class Q2226 {
    public class Solution {
        public int maximumCandies(int[] candies, long k) {
            long sum = 0;
            for (int c : candies) {
                sum += c;
            }
            if (sum < k) {
                return 0;
            }
            
            long left = 1;
            long right = sum / k;
            long ans = 0;
            
            while (left <= right) {
                long mid = left + (right - left) / 2;
                long cnt = 0;
                for (int c : candies) {
                    cnt += c / mid;
                }
                if (cnt >= k) {
                    ans = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            return (int) ans;
        }
    } 
}
