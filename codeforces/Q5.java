import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int k =  sc.nextInt();

        int [] arr = new int[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  sc.nextInt();
            
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>= arr[k -1]&& arr[i] > 0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
