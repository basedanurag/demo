import java.util.*;

public class Q7 {
    public static void helper(int index, int target, List<Integer> combination, List<List<Integer>> combinations,
            int[] arr) {
        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            // take
            if (i > index && arr[i] == arr[i - 1])
                continue;
            if (target < arr[i]) {
                break;
            }
            combination.add(arr[i]);

            helper(i + 1, target - arr[i], combination, combinations, arr);
            combination.remove(combination.size() - 1);
        }

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, target, new ArrayList<>(), combinations, candidates);

        return combinations;
    }

    public static void main(String[] args) {
            int arr[] = { 2, 3,6, 7 };
        int k = 7;
        List<List<Integer>> ans = combinationSum2(arr, k);
        for (List<Integer> list : ans) {
            System.out.print(list);
        }
    }
}