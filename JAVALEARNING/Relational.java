import java.util.Scanner;

public class Relational {
    public static void main (String[] args) {
        // Q-1 Find a number is odd or even
        int a;
        System.out.println("enter the value of number to check if it is odd or even");
        Scanner s  = new Scanner(System.in);
         a = s.nextInt();
       
        if ( a %2 != 0){
            System.out.println("0dd");
        } else {
            System.out.println("even");
        }
       s.close();
    }
}