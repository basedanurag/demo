public class Q5 {
    public static int upperBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int blackBox(int[][] mat, int mid) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            count += upperBound(mat[i], mid);
        }
        return count;
    }

    public static int median(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][m - 1]);
        }
        int req = (n * m + 1 ) / 2;

        while (low <= high) {
            int mid = (low + high) / 2;
            int smallest = blackBox(mat, mid);
            if (smallest < req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5 },
                { 2, 6, 9 },
                { 3, 6, 9 }
        };
        System.out.println(median(matrix));
    }
}
