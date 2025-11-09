import java.util.Arrays;

public class ArrayMaxElement {
    public static int SortingMethod(int[] arr){
        Arrays.sort(arr);
        int Max = arr[arr.length - 1];
        return Max;
    }
    public static int reccursiveMethod(int arr[],  int n){
        int Max = arr[0];
        for(int i = 0; i< n; i++){
            if (arr[i] > Max){
                Max = arr[i];
            }
        }
        return Max;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,31,4,5,6};
        System.out.println("Using the sorting method to find the max element which is  "+SortingMethod(arr));

        System.out.println("Using the Recursion method to find the max element which is  "+reccursiveMethod(arr,arr.length));
    }
}
