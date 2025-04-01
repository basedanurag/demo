import java.util.Scanner;

public class studentchallangeSwoid{
 public static void main(String[] args){
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    switch (day) {
        case 1 : System.out.println("one");
                 break;
        case 2 : System.out.println("two");
                 break;
        case 3 : System.out.println("three");
                 break;
        default : System.out.println("invalid selection");
                 break;
    }
        sc.close();
    
 }
}