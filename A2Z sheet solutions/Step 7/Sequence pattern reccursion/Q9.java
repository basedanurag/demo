import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q9 {
    public void helper(int index, int[] arr, List<List<Integer>> result, List<Integer> ans) {
        result.add(new ArrayList<>(ans));
        // taking
        for (int i = index; i < arr.length; i++) {
            // for skipping the duplicates 
            if (i > index && arr[i] == arr[i - 1]) continue;

            ans.add(arr[i]);
            helper(i + 1, arr, result, ans);
            ans.remove(ans.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        helper(0, nums, result, ans);
        return result;
    }
    public static void main(String[] args) {
        
    }
}
