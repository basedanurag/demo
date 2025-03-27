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
/* // to find if a number is leap year or not
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
    */
  /*  //date calendar
    public static void main(String[] args){
        System.out.println("enter the number to check its day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if(day==1){
            System.out.println("the day is monday");

        }else if(day ==2){
            System.out.println("the day is tuesday");

        }else if(day ==3){
            System.out.println("the day is wed");

        }else if(day ==4){
            System.out.println("the day is thurs");

        }else if(day ==5){
            System.out.println("the day is friday");

        }else if(day ==6){
            System.out.println("the day is saturday");

        }else if(day ==7){
            System.out.println("the day is sunday");

        }
    sc.close();
    }*/
    // checking the website 
    public static void main(String[] args){
    System.out.println("enter the website as a String");
    Scanner sc = new Scanner (System.in);
    String site = sc.nextLine();
    if(site.startsWith("https")){
        System.out.println("the protocol is https");
    }else if(site.startsWith("ftp")){
        System.out.println("the protocol is ftp");   
}
if(site.endsWith((".com"))){
    System.out.println("the site is commercial");
}else if(site.endsWith(".org")){
    System.out.println("the site is organisational");   
}else if(site.endsWith(".net")){
    System.out.println("the site is network");   
}
sc.close();


    }

}
