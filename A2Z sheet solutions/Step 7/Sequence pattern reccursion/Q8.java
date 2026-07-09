import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Q8 {
    public static void helper(int index, int sum , int [] arr, List<Integer> ans){
        if(index == arr.length){
            ans.add(sum);
            return;
        }
        // taking
        ans.add(arr[index]);
        helper( index + 1, sum + arr[index], arr, ans);
        ans.remove(ans.size() - 1);
        // not taking
        helper( index + 1, sum, arr, ans);
    }
    public static void main(String[] args) {
         int[] arr = {5, 2, 1};
        List<Integer> result = new ArrayList<>();
         helper(0, 0,arr, result);
         Collections.sort(result);

        for (int sum : result) {
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
