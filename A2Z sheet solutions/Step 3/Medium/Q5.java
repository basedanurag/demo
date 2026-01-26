// Question 5: Maximum Subarray Sum using Kadane's Algorithm (Sliding Window Approach)
// Time Complexity: O(n)
// Space Complexity: O(1)
public class Q5 {
     // Kadane's Algorithm - Sliding window approach to find maximum subarray sum
     // This algorithm uses a single pass through the array to find the maximum sum
     // and tracks the start and end indices of the subarray
     public static int KadanesAlgorithm(int [] arr){
        int max = Integer.MIN_VALUE;  // stores the maximum sum found so far
        int sum = 0;                   // current window sum
        int start = -1;                // marks the start of current window
        int ansstart = -1;             // stores the start index of maximum sum subarray
        int ansend = -1;               // stores the end index of maximum sum subarray

        // Sliding window: iterate through the array with a single pointer
        for (int i = 0; i < arr.length; i++) {
            // If current sum is 0, mark the start of a new window
            if(sum == 0) start = i;

            // Add current element to the window sum
            sum += arr[i];

            // If current sum is greater than max, update max and store indices
            if(sum > max){
                max = Math.max(max, sum);
                ansstart = start ;
                ansend = i;
            }

            // If current sum becomes negative, reset the window (shrink from left)
            // This is the key of Kadane's algorithm - discard negative sums
            if(sum < 0){
                sum = 0;
            }
        }
        
        // Print the subarray with maximum sum
        System.out.print("[");
        for(int i = ansstart; i <= ansend; i++){
            System.out.print(""+arr[i] +", ");
        }
        System.out.println("]");

        // Return the maximum sum found
        return max;
    }
    
    public static void main(String[] args) {
        // Test case 1: array with mixed positive and negative numbers
        int [] arr = {2, 3, 5, -2, 7, -4};
        // Test case 2: array with all negative numbers
        int[] nums = {-2, -3, -7, -2, -10, -4};
        
        // Find and print maximum subarray sum for both test cases
        System.out.println(KadanesAlgorithm(arr));
        System.out.println();
        System.out.println(KadanesAlgorithm(nums));
        
    }
}
