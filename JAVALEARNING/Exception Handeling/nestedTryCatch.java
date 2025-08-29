import java.util.Scanner;
class NegativeIntegerException extends Exception{
    public  int area(int a , int b)throws Exception
    {    int area = 0;
        if ( a < 0 || b < 0)
        throw new Exception();
        try{ 

            area = a / b;
        }catch(ArithmeticException e){
            System.out.println("area is 0");
        }
        return area;
    }
}  
public class nestedTryCatch {
    public static int div(int a , int b){
        int c = 0;
        try{
             c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        return c;
    }
    public static void main(String[] args) throws Exception {
        NegativeIntegerException  n = new NegativeIntegerException();


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b =  sc.nextInt();
        System.out.println(div(a, b));
// exception class practice done 
// throw and throws keyword done 
        n.area(a, b);
        sc.close();
    }
}
