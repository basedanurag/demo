import java.util.ArrayList;
import java.util.Collections;

public class Q9 {
    public static void optimalSol(int[] arr){
    
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int Leader = arr[n - 1];
        if (n == 0){
            return;
        }

        res.add(Leader);
        for(int i = n - 2; i>= 0; i--){

         if (arr[i] > Leader) {
            res.add(arr[i]);
            Leader = arr[i];
         }   

        }
        Collections.reverse(res);
        for (Integer integer : res) {
            System.out.print(" "+ integer);
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 7, 1, 0};
        optimalSol(arr);
    }
}
