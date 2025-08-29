import java.util.Scanner;

public class Relational {
    public static void main (String[] args) {
       /* // Q-1 Find a number is odd or even
        int a;
        System.out.println("enter the value of number to check if it is odd or even");
        Scanner s  = new Scanner(System.in);
         a = s.nextInt();
       
        if ( a %2 != 0){
            System.out.println("0dd");
        } else {
            System.out.println("even");
        }
       s.close();*/
   /*  //Q-2 Find a person is young or not
       int a,b;
       System.out.println("enter the value of number to check who is younger");
        Scanner s  = new Scanner(System.in);
        System.out.println("enter the age of a ");
        a=s.nextInt();
        System.out.println("enter the age of b ");
        b = s.nextInt();
        if(a>b) {
            System.out.println("a is elder and b is younger ");

        } else if(a==b){
            System.out.println("both are of same age ");
        }
        else{
        System.out.println("b is elder and a is younger ");
        
    }

        s.close(); */

        //Q-3 find grades of given marks 
      /*   int a,b,c;
        System.out.println("enter the value of number to check if it is odd or even");
        Scanner s  = new Scanner(System.in);
        System.out.println("enter marks for a");
         a = s.nextInt(); 
         System.out.println("enter marks for b");
         b = s.nextInt(); 
         System.out.println("enter marks for c");
         c = s.nextInt(); 
         int total = a + b + c;
         int avg = total/3;
         if(avg > 70) {
            System.out.println("Grade A");
         }
         else if( avg >=60 && avg < 70 ) {
            System.out.println("Grade B");
         }else if(avg >= 50 && avg< 60) {
            System.out.println("Grade C");
         } 
         else if(avg >= 40 && avg< 50) {
            System.out.println("Grade D");
         }
         else if(avg <  40) {
            System.out.println("Grade F");

         } 
         s.close(); */

         /*// Q check the radix of the given numbers 
         String num = new String();
         System.out.println("enter the value of number to check its radix");
        Scanner s  = new Scanner(System.in);
         num = s.nextLine();
         if(num.matches( "[01]*")) {
            System.out.println("it is a binary String with Radix 2");
            
         }
         else if(num.matches("[0-7]*")){
            System.out.println("it is a octal String with Radix 8");
         }
         else if(num.matches("[A-F0-9]*")) {
            System.out.println("it is a Hexa String with Radix 16");
         }
         else if(num.matches("[0-9]*")) {
            System.out.println("it is a Decimal String with Radix 10");
         }
         else 
         System.out.println("invalid number");

         
s.close(); */

//Q Find a given number is a leap year or not

int a;
System.out.println("enter the value of number to check if it is leap year or not a leapyear");
Scanner s  = new Scanner(System.in);
 a = s.nextInt();

if ( a %4 == 0){
      if(a % 100 == 0){
        if(a%400==0) {
            System.out.println("is a leap year");

        } else {
            System.out.println("not a leap year");
        }

    }else{
        System.out.println("is a leap year");
    }
}else {
    System.out.println("not a leap year");
} s.close();
    }
}