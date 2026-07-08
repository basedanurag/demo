import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void generate(String s, List<String> result, int n, int opens , int close) {
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }



        if (opens < n) {
            generate(s + "(", result, n, opens + 1, close);
        }
        
        if(close < opens)
        generate(s + ")", result, n, opens, close + 1);

    }
    // public static List<String> generateParenthesis(int n) {

    // }
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        int n = 3;
        int opens  = 0;
        int close  = 0;
        generate("", result, n, opens, close);

        for (String string : result) {
            System.out.print(string + " ");
        }
    }
}
