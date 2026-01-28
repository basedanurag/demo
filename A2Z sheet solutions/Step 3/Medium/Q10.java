
import java.util.*;

public class Q10 {
    public static boolean linearSearch(int[] arr, int x){
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                found = true;
                return found;
            }
        }
        return found;
    }
    public static int bruteForce(int[] arr){
        int longest =1;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int x  =  arr[i];
            count = 1;

            while(linearSearch(arr,x + 1) == true){
                count++;
                x = x + 1;
            }
            longest = Math.max(longest,count);
        }
        
        
        
        return longest;
    }
    public static int LongestSequence(int[]arr){
        Arrays.sort(arr);
        int count = 0;
        int smallest = Integer.MIN_VALUE;
        int longest = 1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] - 1 == smallest){
                count++;
                smallest = arr[i];
            }
            else if(arr[i] != smallest){
                count = 1;
                smallest = arr[i];
            }
            longest =  Math.max(longest, count);
        }
        return longest;
    }
    public static int optimalSol(int[] arr){
        int longest  = 1;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int it : set) {
            if(!set.contains(it - 1)){
                count = 1;
                int x = it;  
                while(set.contains(x + 1)){
                    count++;
                    x +=1;
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(LongestSequence(arr));
        System.out.println(bruteForce(arr));
        System.out.println(optimalSol(arr));
    }
}
