import java.util.*;

public class Q11 {
    public static void helper(int index, String ans, Map<Character, String> map, List<String> result, String digits) {
        // base case
        if (index == digits.length()) {
            result.add(ans);
            return;
        }
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            char chosen = letters.charAt(i);
            helper(index + 1, ans + chosen, map, result, digits);
        }

    }

    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        helper(0, "", map, result, digits);

        return result;
    }

    public static void main(String[] args) {

    }
}