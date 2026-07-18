import java.util.Scanner;

public class Q2247A{

    public static void check(int [] arr){
        int sum = 0;
        for (int i : arr) {
          sum += i;
            
        }
        if(sum %4 == 0){
            System.out.println("yes");
            return;
        }

        System.out.println("no");

    }
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int n  =  sc.nextInt();
        while (n-- > 0) {
            int len  =  sc.nextInt();
            int arr[]  = new int[len];
            for(int i = 0; i < len ; i++){
                arr[i] =  sc.nextInt();
            }

            check(arr);

        }
        sc.close();
    }
}