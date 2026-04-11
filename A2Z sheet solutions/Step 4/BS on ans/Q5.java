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
    public static int optimal(int[] arr, int limit){
        int low  = 1;
        int high  = Arrays.stream(arr).max().getAsInt();

        int ans  = 0;

        while (low <= high) {
            int mid  = (low + high )/2;
            int sum  = 0; // bar bar reset hoga 

            for (int i = 0; i < arr.length; i++) {
                sum += (int) Math.ceil((double) arr[i]/ mid);
            } 
            if(sum <= limit){
                ans = mid;
                high = mid - 1;

            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(bruteforce(arr, 8));
        System.out.println(optimal(arr, 8));
        int arr2[] = {8,4,2,3};
        System.out.println(bruteforce(arr2, 10));
        System.out.println(optimal(arr2, 10));
    }
}
