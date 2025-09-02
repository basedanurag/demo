import java.util.*;


public class ReccursionPlayList {
    public static void Name(int i, int n){
        if (i > n)
          return ;
     
    System.out.println("Anurag");
        Name(i + 1, n);
    }
    public static void Linear(int i , int n){
        if (i > n) // BASE CASE FOR LIMITING THE RECURSION
        return;
        System.out.print(i + " ");
        Linear(i + 1, n);
    }
    public static void Linear2(int n){
        if (n < 0) // BASE CASE FOR LIMITING THE RECURSION
        return;
        System.out.print(n + " ");
        Linear2(n-1);
    }
    public static void Linear3(int i,int n){ // using backtracking
        if (i < 1) // BASE CASE FOR LIMITING THE RECURSION
        return;
        Linear3(i - 1, n);
        System.out.print(i + " ");
    }
      public static void Linear4(int i,int n){ // using backtracking
        if (i > n) // BASE CASE FOR LIMITING THE RECURSION
        return;
        Linear4(i + 1, n);
        System.out.print(i + " ");
    }




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hello");
        int  n;
        System.out.println("enter n"); // this is the base case condition limit to break the recursion
        n = sc.nextInt();
        System.out.print("output for Name method");
        Name(0, n);
        System.out.println("output for Liner( n to 0)");
        Linear2(n);
        System.out.println("output for Liner using back tracking( 1 to n)");
        Linear3(n,n);
        System.out.println("output for Liner using back tracking( n to 1)");
        Linear4(1,n);



        sc.close();
    }
}
