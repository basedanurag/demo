import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();

        
        int left  = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            
            }
            else{
                temp.add(arr[right++]);

            }
        }
          // Add remaining left elements
        while (left <= mid)
            temp.add(arr[left++]);

        // Add remaining right elements
        while (right <= high)
            temp.add(arr[right++]);

        // Copy back to original array
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }
    public static void mergesort(int[] arr,int low , int high){
        int n = arr.length;
        for(int i= 0; i < n;i++){
            if (low == high) return;

            int mid  = ((low + high)/2);
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        int n  = arr.length;
        for (int i = 0; i < arr.length; i++) {
        System.out.println("enter the ith element of array to sort "+ i);
            arr[i] = sc.nextInt();

        }
        mergesort(arr, 0, n-1);

        System.out.println("after sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");            
        }
        sc.close();
        
    }
}
