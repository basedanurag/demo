import java.util.Arrays;

public class SortedChecker {
    public static boolean isSorted(int arr[]){
        int n  = arr.length;
        if( n < 2) return true;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
         return true;
    }
    public static void main(String[] args) {
           int[] arr = {3,1,31,4,5,6};
        System.out.println("checking if the array is sorted or not  "+isSorted(arr));
        Arrays.sort(arr);
        System.out.println("checking after sorting " + isSorted(arr));

    }
}
