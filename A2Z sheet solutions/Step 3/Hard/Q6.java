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
        int xor = 0;
        for(int i = 0; i < arr.length; i++){
            xor = xor ^ arr[i];
            int checkX  =  xor ^ x;
            if (hmap.containsKey(checkX)){
                count++;
            }
            else {
                hmap.put(xor, hmap.getOrDefault(, null))
            }
        }


        return count;

    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        System.out.println(bruteForce(arr,6 ));
    }
}
