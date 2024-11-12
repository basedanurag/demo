package JAVALEARNING;
// swapping of two numbers without using a third variable and using xor operator

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of a ");
        a=s.nextInt();
        System.out.println("enter the value of b ");
        b=s.nextInt();
        System.out.println("Numbers before swapping are a = " + a + " and b = " + b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Numbers after swapping are a = " + a + " and b = " + b);
        s.close();
    }
}
