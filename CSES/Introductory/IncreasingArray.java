import java.util.Scanner;

public class IncreasingArray {
    public static int solve(int arr[]){
        int n = arr.length;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if(arr[i] < arr[i - 1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
        sc.close();
    }
}
