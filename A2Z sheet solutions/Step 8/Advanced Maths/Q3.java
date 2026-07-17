import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {
     public static List<Integer> primeRange(int l, int r) {
        
        List<Integer> ans = new ArrayList<>();
        int[] arr = new int[r + 1];
        Arrays.fill(arr,1);
        
        for(int i = l; i * i <= r; i++){
            if(arr[i] ==  1){
                for(int j =  i*i; j <= r; j+=i){
                    arr[j] = 0;
                }
            }
        }
        for (int i = l; i < arr.length; i++) {
            if(arr[i] == 1)
            ans.add(i);
        }
        
       
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        ans = primeRange(2, 30);
        for (Integer integer : ans) {
           
            System.out.print(integer + " ");
        }
    }
}
