import java.util.Arrays;

public class Q1526 {
    class Solution {
    public int minNumberOperations(int[] target) {
        int n =  target.length;
        int count = 0;
        int[] arr = new int[n];
        Arrays.fill(arr,0);
        int curr = 0;
        int prev =0;
        for(int i = 0; i <  n; i++){
            curr =  target[i] - arr[i];
           if(Math.abs(curr) > Math.abs(prev)){
            count += Math.abs(curr -  prev);
           }
            prev =  curr;
        }
        return count;
    }
}
}
