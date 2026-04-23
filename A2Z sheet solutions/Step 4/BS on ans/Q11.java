import java.util.Arrays;

public class Q11 {
   public static boolean isPossible(int [] arr, int mid , int k){
        int allocated = 1, sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mid) return false;

            if(sum + arr[i] > mid){
                allocated++;
                sum = arr[i];

            }else{
                sum += arr[i];
            }

        }
        if(allocated > k){
            return false;
        }

        return true;
    }
    public static int optimal(int[] arr, int k) {
        int low = Arrays.stream(arr).min().getAsInt();
        int high  = Arrays.stream(arr).sum();
        int res = 0;
        if ( arr.length < k ) return -1;
        while(low <= high){
            int mid = low +  (high - low )/2;

            if(isPossible(arr, mid, k)){
                res =  mid;
                high = mid - 1;

            }
            else{
                low  =  mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int boards[] = {10, 20, 30, 40}, k = 2;
        System.out.println(optimal(boards, k));
    }
}
