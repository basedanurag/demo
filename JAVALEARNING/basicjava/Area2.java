

import java.util.Scanner;

public class Area2 {
    public static void main(String[] args) {
        /* this is the programme for area of the triangle */
        Scanner s=new Scanner(System.in);

        float height,base,c;
        double Area;
        System.out.println("enter height and base of the triangle");
        System.out.println("enter height");
        height= s.nextFloat();
        System.out.println("enter base");
        base=s.nextFloat();
        System.out.println("enter c");
        c=s.nextFloat();
        /*here we will find s and then use it in area formulla*/
        float sc= 1f/2f* ( base + height  + c );
        /* area of triangle using 3 sides is  below*/

        Area = Math.sqrt(sc*(sc-height)*(sc-base)*(sc-c));

                System.out.println("the area of the trianle is "+Area);
                s.close();
            

    }
}

