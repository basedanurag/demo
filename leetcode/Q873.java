import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q873 {
    class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> mp = new HashMap<>();
        int[][] t =  new int[n][n];
        for(int[] row : t )Arrays.fill(row, 2);
        //t[j][k] =  length of thw longest fibbonacci series 
        for(int i =0; i< n ; i++) {
            mp.put(arr[i], i);

        }
        int Max_length =0;
        for(int j =1; j < n ; j++) {
            for(int k =j + 1; k< n ; k++){
                int target = arr[k] -  arr[j];
                if(mp.containsKey(target) && mp.get(target) < j) {
                    int i = mp.get(target);
                    t[j][k] = t[i][j] + 1;
                }
                Max_length = Math.max(Max_length, t[j][k]);
            }
        }
        return Max_length >= 3 ? Max_length : 0;
    }
}
}
