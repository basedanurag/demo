import java.util.Scanner;

public class studentchallangeSwoid{
 /*public static void main(String[] args){
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
    
 }*/
public static void main(String[] args){
    System.out.println(" enter the website domain name  ");
     Scanner sc = new Scanner(System.in);
     String domain = sc.nextLine();
     String ext = domain.substring(domain.lastIndexOf(".")+1);
      switch (ext){
        case "org" : System.out.println("this is a organisational web domain");
                         break;
        case "in" : System.out.println("this is a indian web domain");
                         break;
        case "com" : System.out.println("this is a commercial web domain");
                         break;
        case "net" : System.out.println("this is a network web domain");
                         break;
      }
      sc.close();

}
}