import java.util.*;

public class Q9 {
    public static void bruteForce(int [] arr){ //Tc  =  O(n^2) sc = O(n)
      
        List<Integer> res = new ArrayList<>();
        

        for (int i = 0; i < arr.length; i++) {
              boolean  leader = true;
            for (int j = i + 1; j < arr.length ; j++) {
                if (  arr[j] >= arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader){
                res.add(arr[i]);
            }
        }
          
        for (Integer integer : res) {
            System.out.print(" "+ integer);
            
        }

    }
    public static void optimalSol(int[] arr){ // Tc  =  O(n) sc = O(n)
    
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
        int arr[] = {10, 22, 12, 3, 0, 6};
        optimalSol(arr);
       System.out.println("\n brute force");
       bruteForce(arr);
    }
}
