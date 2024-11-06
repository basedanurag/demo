package JAVALEARNING;

import java.util.Scanner;

public class Cuboid {
    public static void main(String arg[])
    { int Area,volume;

        int l,b,h;
        Scanner s=new Scanner(System.in);
        l=s.nextInt();
        b=s.nextInt();
        h=s.nextInt();
        Area=(l*b) + (b*h) + (l*h);
        volume=l*b*h;
        System.out.println("Area of the cuboid is "+Area);
        System.out.println("volume of the cuboid is "+volume);
        s.close();
    }

}
