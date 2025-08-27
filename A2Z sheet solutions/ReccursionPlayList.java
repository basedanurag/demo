import java.util.*;


public class ReccursionPlayList {
    public static void Name(int i, int n){
        if (i > n)
        return ;
        System.out.println("Anurag");
        Name(i + 1, n);
    }
    public static void Linear(int i , int n){
        if (i > n)
        return;
        System.out.print(i + " ");
        Linear(i + 1, n);
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hello");
        int i, n;
        System.out.println("enter i"); // this will iterate 
        i = sc.nextInt();
        System.out.println("enter n"); // this is the base case condition limit to break the recursion
        n = sc.nextInt();
        System.out.print("output for Name method");
        Name(i, n);
        System.out.println("output for Liner( 1 --> n)");
        Linear(1, n);

        sc.close();
    }
}
