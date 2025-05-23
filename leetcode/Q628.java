public class Q628 {
        public static int maximumProduct(int[] nums) {
            // Initialize the three largest and two smallest numbers
            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
            
            // Traverse through each number in the array
            for (int num : nums) {
                // Update the three largest numbers
                if (num > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max3 = max2;
                    max2 = num;
                } else if (num > max3) {
                    max3 = num;
                }
                
                // Update the two smallest numbers
                if (num < min1) {
                    min2 = min1;
                    min1 = num;
                } else if (num < min2) {
                    min2 = num;
                }
            }
            
            // Calculate the maximum product of three numbers
            return Math.max(max1 * max2 * max3, max1 * min1 * min2);
        }
    }