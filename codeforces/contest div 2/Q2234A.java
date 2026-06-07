import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q2234A{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        // total test cases 
        int n  =  sc.nextInt();
        

        while (n-- > 0) {
           
            // number of elements in array
            int t =  sc.nextInt();
            // array to store the data 
            Long [] arr =  new Long[t];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextLong();
                
            }
            boolean check = true;

            Arrays.sort(arr,Collections.reverseOrder());
           for (int i = 0; i < arr.length - 2; i++) {
            
            if(arr[i] % arr[i + 1] != arr[i + 2] ){
                check =  false;
                break;
            }
           }
            if(!check){
                System.out.println(-1);
            }
            else{
                System.out.println(arr[0] + " " + arr[1]);
            }
        }
        sc.close();

    }

}