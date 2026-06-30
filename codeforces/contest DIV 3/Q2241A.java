import java.util.Scanner;

public class Q2241A{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        // num of testcases
        int n  =  sc.nextInt();
        while (n-- > 0) {
            int x =  sc.nextInt();
            int y =  sc.nextInt();
            if(x % y == 0){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}