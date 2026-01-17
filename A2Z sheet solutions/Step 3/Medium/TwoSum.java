import java.util.HashMap;

public class TwoSum{
    public static int[] TwoSumBrute(int[] arr, int n){
        // this is the most basic version of 2 pointer two sum TC (ON^2) and space is O(1)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                if(n - arr[j] == arr[i]){
                    return new int[] {i,j};
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
    public static void main(String[] args) {
        
    }
}