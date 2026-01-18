import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
    public static String TwoSumBrute(int[] arr, int n){
        // this is the most basic version of 2 pointer two sum TC (ON^2) and space is O(1)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                if(n - arr[j] == arr[i]){
                    return "yes";
                }
            }
        }

        return null;
    }
    public static String TwoSumBetter(int[] arr, int n){
        HashMap<Integer, Integer> hmp  = new HashMap<>();
        for(int i = 0; i < arr.length;  i++){
            int number = n - arr[i];
            if(hmp.containsKey(number)){
                return "Yes";
            }

            hmp.put(arr[i], i);
        }
        
        return "NO";
    }
    public static String TwoSumOptimal(int[] arr, int n){
        Arrays.sort(arr);
       int i = arr[0];
       int j =  arr[arr.length - 1];
       
       while (i < arr.length - 1){
            int num1 =  i;
            while(j >= 0){
                int num2 = j;

                if(num1 + num2 == n ){
                    return "Yes";
                }
                j--;
            }
            i++;
       }
       
       
        return "No";
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int n = 9;
      System.out.println( "Solution of Brute force approach "+ TwoSumBrute(arr, n));
       System.out.println( "Solution of Better approach "+TwoSumBetter(arr, n));
       System.out.println( "Solution of optimal approach " +TwoSumOptimal(arr, n));

    }
}