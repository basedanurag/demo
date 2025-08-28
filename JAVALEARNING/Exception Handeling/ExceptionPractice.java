import java.util.Scanner;

public class ExceptionPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b ");
        int b = sc.nextInt();
        try{
        int c  = a/b; 
        System.out.println("the result is " + c);
        }catch(ArithmeticException e){
            System.out.println("cant divide by 0 ");
        }
        finally{
            System.out.println("this will execute no matter what so we can use this for many cases");
        }
        System.out.println("Bye");
        sc.close();

    }
}