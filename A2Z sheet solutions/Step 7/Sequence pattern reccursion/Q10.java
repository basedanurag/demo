import java.util.ArrayList;
import java.util.List;

public class Q10 {
    class Solution {
        public void helper(int index, int k, int target, List<List<Integer>> res, List<Integer> ans) {
            if (ans.size() == k) {
                if (target == 0) {
                    res.add(new ArrayList<>(ans));
                }
                return;
            }
            for (int i = index; i <= 9; i++) {
                if (target >= i) {
                    ans.add(i);
                    // take
                    helper(i + 1, k, target - i, res, ans);
                    ans.remove(ans.size() - 1);
                }
            }
        }

        public List<List<Integer>> combinationSum3(int k, int target) {
            List<List<Integer>> res = new ArrayList<>();

            List<Integer> ans = new ArrayList<>();
            helper(1, k, target, res, ans);

            return res;

        }
    }
    public static void main(String[] args) {
        
    }
}
