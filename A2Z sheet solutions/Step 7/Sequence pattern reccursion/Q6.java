import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public static void helper(int index, int target, List<Integer> combination, List<List<Integer>> combinations, int[] candidates) {
        if (index == candidates.length) {
            if (target == 0) {
                combinations.add(new ArrayList<>(combination));
            }
            return;
        }
        if (candidates[index] <= target) {
            // take
            combination.add(candidates[index]);
            helper(index, target - candidates[index], combination, combinations, candidates);
            combination.remove(combination.size() - 1);
        }
        // not take
        helper(index + 1, target, combination, combinations, candidates);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        helper(0, target, new ArrayList<>(), combinations, candidates);
        return combinations;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3,6, 7 };
        int k = 7;
        List<List<Integer>> ans = combinationSum(arr, k);
        for (List<Integer> list : ans) {
            System.out.print(list);
        }
    }
}
