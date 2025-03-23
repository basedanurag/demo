import java.util.Scanner;

public class StudentChallanges {
    // find radix
    /*public static void main(String[] args){
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if(num.matches("[0-9]+")){
            System.out.println("num is decimal so Radix is : 10");
        }
        else if (num.matches("[0-7]+")) {
            System.out.println("num is octal so Radix is : 8");
            
        }
        else if (num.matches("[0-9A-Z]+")) {
            System.out.println("num is hexadecimal so Radix is : 16");
            
        }
        else if (num.matches("[01]+")) {
            System.out.println("num is binary so Radix is : 2");
            
        }
        else{
            System.out.println("error");
        }
        sc.close();
}
*/
 // to find if a number is leap year or not
 public static void main(String[] args) {
    System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%4==0){
        if(num%100 == 0){
            System.out.println("not a leap year");
            if(num%400==0){
        System.out.println("it is a leap year ");
            }
            else{
                System.out.println("it is not a leap year ");
            }
        }
        else{
            System.out.println("it is a leap year");
        }
    }
    else {
        System.out.println(" it is not a leap year");
    }
    sc.close();

 }
    
}
