import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        int n  = arr.length;
        for (int i = 0; i < n; i++) {
        System.out.print("enter the ith element of array to sort "+ i+ " ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        // BUBBLE SORT ALGORITHM
            for(int i =  n - 1; i >=0; i--){
                int didSwap = 0;
                for (int j = 0; j <= i -1 ; j++) {
                    if (arr[j]> arr[j + 1]){
                        //swap
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[ j] = temp;
                        didSwap = 1;
                    }
                    if(didSwap == 0)
                        break;
                }
            }
            System.out.println("array after sorting");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        sc.close();

    }
}
