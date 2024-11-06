public class Q268 {

    public static int missingNumber(int[] nums) {
        insertionSort(nums); // Step 2: Sort the array using Insertion Sort

        int left = 0, right = nums.length;

        // Step 3: Binary search for the missing number
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        // 'left' will be the missing number
        return left;
    }

    // Insertion Sort Algorithm
    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("The missing number is: " + missingNumber(nums));
    }
}
