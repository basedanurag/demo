import java.util.Arrays;

public class Q5 {
    public static int bruteforce(int[] arr, int k) {
        int max = Arrays.stream(arr).max().getAsInt();
        int n = arr.length;

        
        for (int i = 1; i <= max; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += (int) Math.ceil((double) arr[j] / i);
            }

            if (sum <= k)
                return i;

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(bruteforce(arr, 8));
    }
}
