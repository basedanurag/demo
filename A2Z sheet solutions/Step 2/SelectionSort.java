import java.util.Scanner;

public class SelectionSort {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        int n  = arr.length;
        for (int i = 0; i < arr.length; i++) {
        System.out.println("enter the ith element of array to sort "+ i);
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
          
            int min = i;
            for(int j = i + 1 ; j < n ; j++){

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        sc.close();
    }
}
