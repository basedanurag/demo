import java.util.Scanner;

public class Switchcase {
    // here we will practice switch case for java
    public static void main(String[] args){
        System.out.println("enter the case ");
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        switch(num){
            case 1: System.out.println("num is one ");
            break;
            case 2:  System.out.println("num is two ");
            break;
            case 3:  System.out.println("num is one ");
            break;
            default : System.out.println("wrong choice"); 

        }
        sc.close();
    }
}
