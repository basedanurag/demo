import java.util.*;


public class ReccursionPlayList {
    public static void printName(int n){
        if(n == 0)
        return ;
        System.out.println("Anurag");
        printName(n - 1);
    }

    //recursive method for printing 1 -> n linearly
    public static void pintNumber(int i, int n){
        if(i > n)
        return;
        System.out.print(i +" "); 
        pintNumber(i + 1, n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hello");
        int  n;
        System.out.println("enter n"); 
        n = sc.nextInt();

        System.out.println("output for printing name N times");
        printName(n);

        System.out.println("output for printing 1 -> N (linearly) using reccursion");
        pintNumber(1, n);
    



        sc.close();
    }
}
