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
    public static void main(String args[]){
         int arr[] = {7, 15, 6, 3};
        System.out.println(bruteforce(arr, 8));
    }
}