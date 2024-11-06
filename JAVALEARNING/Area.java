package JAVALEARNING;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        /* this is the programme for area of the triangle */
        Scanner s=new Scanner(System.in);

        float height,base;
        float Area;
        System.out.println("enter height and base of the triangle");
        System.out.println("enter height");
        height= s.nextFloat();

        System.out.println("enter base");

        base=s.nextFloat();


        Area= 1f/2f* ( base * height );
        System.out.println("the area of the trianle is "+Area);
        s.close();

    }
}
