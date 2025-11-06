import java.util.Scanner;

public class ReccursiveSort {
    public static void recbubblesort(int[] arr, int n) {
        // this is the worst case tc = o(n^2)
        if (n == 1)
            return;
        for (int i = 0; i <= n - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }
        recbubblesort(arr, n - 1);
    }

    public static void recInsertionSort(int[] arr, int i, int n) {

        if (i == n)
            return;
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recInsertionSort(arr, i + 1, n);
    }

    static void insertion_sort(int[] arr, int i, int n) {
        // Base Case: i == n.
        if (i == n)
            return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertion_sort(arr, i + 1, n);

    }

    public static void recbubblesort2(int[] arr, int n) {
        // this is the optimized version case tc = o(n^2)
        if (n == 1)
            return;
        int didswap = 0;
        for (int i = 0; i <= n - 2; i++) {

            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                didswap = 1;
            }
        }
        if (didswap == 0)
            return;
        recbubblesort(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println("enter the ith element of array to sort " + i);
            arr[i] = sc.nextInt();
        }
        // recbubblesort2(arr,n);
        insertion_sort(arr, 0, n);
        System.out.println("after sorting ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
