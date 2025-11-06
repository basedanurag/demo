import java.util.Scanner;

public class QuickSortPractice {
    //method to swap the elements
    public static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =  temp;
    }
    public static int fun(int[] arr, int low, int high){
        //partition method to find the pivot index from array
        int Pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <=Pivot && i <= high-1){
                i++;
            }
            while(arr[j] >= Pivot && j >= low + 1 ){
               j--;
            }
            if(i < j) Swap(arr, i, j);
        }
        Swap(arr, low, j);
        return j;
    }
    public static void QuickSort(int[]arr, int low, int high){
        //QuickSort 
        //TC = O(nlogn);
        //SC = O(1); // better than merge sort as it is not taking any extra space
        if(low < high){
            int PIndex = fun(arr,low,high);
            QuickSort(arr, low, PIndex- 1);
            QuickSort(arr, PIndex + 1, high);
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
        QuickSort(arr, 0, n-1);

        System.out.println("after sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");            
        }
        sc.close();
    }
}
