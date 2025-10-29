import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        int n  = arr.length;
        for (int i = 0; i < n; i++) {
        System.out.print("enter the ith element of array to sort "+ i+ " ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        for(int i  = 0; i < n; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[ j - 1] =  arr[j];
                arr[j] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
