import java.util.*;
public class Q3397 {
    class Solution {
        public int maxDistinctElements(int[] nums, int k) {
            Arrays.sort(nums);

            int prev = Integer.MIN_VALUE;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                int minValue = nums[i] - k;
                if (prev < minValue) {
                    prev = nums[i] - k;
                    count++;
                } else if (prev < nums[i] + k) {
                    prev++;
                    count++;
                }
            }
            return count;
        }
    }
}
