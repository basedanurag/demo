public class Q7 {
    public static int bruteforce(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static int first(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int last(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static int[] optimal(int[] arr, int k) {
        int first = first(arr, k);

        if (first == -1)
            return new int[] { -1, -1 };

        int last = last(arr, k);

        return new int[] { first, last };
    }

    public static int count(int[] array, int target) {
        int ans[] = optimal(array, target);

        if (ans[0] == -1)
            return 0;

        return ans[1] - ans[0] + 1;
    }

    public static void main(String[] args) {
        int array[] = { 1, 1, 2, 2, 2, 2, 2, 3 };
        int ans = count(array, 2);
        System.out.println(bruteforce(array, 2));
        System.out.println(ans);

    }
}