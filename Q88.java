import java.util.Arrays;

public class Q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays and fill nums1 from the end
        int i = m - 1; // Last index of nums1's original elements
        int j = n - 1; // Last index of nums2
        int k = m + n - 1; // Last index of nums1

        // Merge nums2 into nums1 starting from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy any remaining elements from nums2 to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        // Print the merged array
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        Q88 obj = new Q88();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        obj.merge(nums1, m, nums2, n); // Expected output: [1, 2, 2, 3, 5, 6]
    }
}
