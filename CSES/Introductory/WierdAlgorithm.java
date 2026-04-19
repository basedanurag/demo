import java.util.Scanner;

public class WierdAlgorithm{
    public static void Solution(long n ){
        System.out.print(n + " ");
        while (n != 1 &&  n > 0) {
            
            if(n % 2 == 0){
                n = n / 2;
                System.out.print(n + " ");
            }
            else{
                n = (n * 3) + 1;
                System.out.print(n +" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
       // System.out.println("enter number");
        long n  = sc.nextLong();
        
            Solution(n);
        sc.close();
    }
}