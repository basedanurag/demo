import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int count = 0;
        while (n-- > 0) {
            int P =  sc.nextInt();
            int Vasya = sc.nextInt();
            int Tonya = sc.nextInt();
            if( P + Vasya + Tonya >= 2){
                count++;
            }
        }
        System.out.println( count);
        sc.close();
    }
}
