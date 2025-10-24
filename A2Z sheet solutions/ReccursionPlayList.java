import java.util.*;


public class ReccursionPlayList {
    public static void printName(int n){
        if(n == 0)
        return ;
        System.out.println("Anurag");
        printName(n - 1);
    }
   

    public static void main(String[] args){
        ReccursionPlayList r = new ReccursionPlayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("hello");
        int  n;
        System.out.println("enter n"); 
        n = sc.nextInt();


        printName(n);



        sc.close();
    }
}
