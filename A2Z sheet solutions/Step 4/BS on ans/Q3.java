import java.util.Arrays;

public class Q3{
    public static int bruteforce(int[] arr, int h){
        int ans = 0;
        Arrays.sort(arr);
        for(int i = 1; i <= arr[arr.length - 1]; i++ ){
            ans = function(arr, i);
            if(ans <= h) return i;


        }
        return arr[arr.length - 1];
    }
    public static int function(int[] arr, int hourly){
        int totalTime = 0;
        for (int i = 0; i < arr.length; i++) {
            totalTime += Math.ceil((double) arr[i]/ hourly);

        }
        return totalTime;
    }
    public static int optimal(int[] arr, int h){
        int maxPile = Arrays.stream(arr).max().getAsInt();
        long low = 1; 
        long high  = maxPile;
        long ans = Integer.MAX_VALUE;
        long totalHours = 0;

        while(low <= high){
            long mid = (low + high)/2;

           totalHours  = function(arr, (int) mid);

            if(totalHours <= h){
                ans = mid;
                high = mid  - 1;
            }else{
                low = mid + 1;
            }
        }
        return (int) ans;
    }
    public static void main(String args[]){
         int arr[] = {7, 15, 6, 3};
        System.out.println(bruteforce(arr, 8));
        System.out.println(optimal(arr, 8));
    }
}