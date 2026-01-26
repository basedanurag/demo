import java.util.*;

public class Q8 {
    
    // OPTIMAL APPROACH (In-place, O(N) time, O(1) space)
    // This function modifies the given array to its next permutation
    // Since return type is void, array is updated directly
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int idx = -1;   // breakpoint index

        // STEP 1:
        // Find the first index from right where arr[i] < arr[i + 1]
        // This tells us where permutation starts decreasing
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }

        // STEP 2:
        // If no such index exists, array is the last permutation
        // Example: [3, 2, 1]
        // So reverse entire array to get first permutation
        if (idx == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // STEP 3:
        // Find the smallest element greater than arr[idx] on right side
        // and swap it with arr[idx]
        for (int i = n - 1; i > idx; i--) {
            if (arr[i] > arr[idx]) {
                swap(arr, idx, i);
                break;
            }
        }

        // STEP 4:
        // Reverse the elements after idx to get the smallest permutation
        // after the swap
        reverse(arr, idx + 1, n - 1);
    }

    // Helper function to reverse array between two indices
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Helper function to swap two indices in array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // ------------------------------------------------------------
    // BRUTE FORCE APPROACH (Only for understanding)
    /*
        1. Generate all permutations using recursion
        2. Store all permutations in a list
        3. Sort permutations in lexicographical order
        4. Find current permutation
        5. Return the next permutation
        6. If current is last, return first permutation
        Time Complexity: O(N! * N)
        Space Complexity: O(N!)
    */

    // Function to find next permutation using brute force
    public List<Integer> nextPermutationBrute(int[] nums) {

        // List to store all permutations
        List<List<Integer>> all = new ArrayList<>();

        // Sorting ensures permutations are generated in order
        Arrays.sort(nums);

        // Generate all permutations using backtracking
        permute(nums, 0, all);

        // Convert current array into list for comparison
        List<Integer> current = new ArrayList<>();
        for (int num : nums)
            current.add(num);

        // Linear search for current permutation
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).equals(current)) {

                // If last permutation, return first
                if (i == all.size() - 1)
                    return all.get(0);

                // Else return next permutation
                return all.get(i + 1);
            }
        }

        return current;
    }

    // Backtracking function to generate permutations
    private void permute(int[] nums, int start, List<List<Integer>> all) {

        // Base case: one permutation completed
        if (start == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums)
                temp.add(num);

            all.add(new ArrayList<>(temp));
            return;
        }

        // Swap each element with starting index
        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            permute(nums, start + 1, all);
            swap(nums, i, start); // backtrack
        }
    }

    // MAIN FUNCTION (Only for testing locally)
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        System.out.println("Before: " + Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println("After : " + Arrays.toString(nums));
    }
}
