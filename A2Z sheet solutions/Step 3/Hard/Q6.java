import java.util.*;

public class Q6 {
    public static int bruteForce(int[]arr, int x){
        int count = 0;
        // finding all the subarrays of this array 
        for (int i = 0; i < arr.length; i++) {
            int xor = 0;
            for (int j = i; j < arr.length; j++) {
                
                  xor ^= arr[j];
                    if(xor == x){
                        count++;
                    }
                
            }
        }

        return count;
    }
    public static int OptimalApproach(int[] arr, int x){
        Map<Integer, Integer> hmap =  new HashMap<>();
        int count  = 0;
        int xor = 0;                //        int[] arr = {4, 2, 2, 6, 4};

        hmap.put(0, 1);
        for(int i = 0; i < arr.length; i++){ // arr[i] =  4  , 0 ^ 4 == 
            xor = xor ^ arr[i];
            int checkX  =  xor ^ x;
            if (hmap.containsKey(checkX)){
                count += hmap.get(checkX);  
            }
            hmap.put(xor, hmap.getOrDefault(xor,0) + 1);
        }


        return count;

    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        System.out.println(bruteForce(arr,6 ));
        System.out.println(OptimalApproach(arr, 6));
    }
}
