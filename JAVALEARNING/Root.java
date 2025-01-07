import java.util.Scanner;
public class Root {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Double r1,r2,D;
        int a,b,c;
        System.out.println("enter a");
        a=s.nextInt();
        System.out.println("enter b ");
        b=s.nextInt();
        System.out.println("enter c ");
        c=s.nextInt();
        D=Math.sqrt((b*b)-4*a*c);
        r1=(-b+D)/2*a;
        r2=(-b-D)/2*a;
        System.out.println("the roots of quadratic equation are r1=%d\n"+r1);
        System.out.println("the roots of quadratic equation are r2=%d \n "+r2);
        s.close();



    }
}
