//import java.util.*;

public class Patterns {
public static void p1(int n){
        /*
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
 */
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
        System.out.print("*");
        }

    System.out.println();
    }
}
public static void p2(int n){
    /*
* 
* * 
* * *
* * * *
* * * * *
* * * * * *
     */
    for(int i = 0; i <= n; i++){
        for(int j  = 0; j < i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void p3(int n ){
    
    for(int i = 0; i <= n; i++){
           for(int j  = 0; j <= i; j++){
            System.out.print(j + 1 );
        }
        System.out.println();
    }
}
public static void p4(int n){
     for(int i = 0; i <= n; i++){
           for(int j  = 0; j <= i; j++){
            System.out.print(i + 1 );
        }
        System.out.println();
    }

}
public static void p5(int n){
    for( int i  = 0; i < n; i++){
        for(int j  =  n ; j > i; j--){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args){
       
        p1(5);
        p2(5);
        p3(5);
        p4(5);
        p5(5);

    }
}