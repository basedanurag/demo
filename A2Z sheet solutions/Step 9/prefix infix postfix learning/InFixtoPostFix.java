import java.util.Stack;
public class InFixtoPostFix {

    public static int priority(char c) {

        if (c == '^') return 3;
        if (c == '*' || c == '/') return 2;
        if (c == '+' || c == '-') return 1;

        return -1;
    }

    public static String infixToPostfix(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }

            else if (ch == '(') {
                st.push(ch);
            }

            else if (ch == ')') {

                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }

                st.pop();
            }

            else {

                while (!st.isEmpty() &&
                       ((priority(ch) < priority(st.peek())) ||
                        (priority(ch) == priority(st.peek()) && ch != '^'))) {

                    ans.append(st.pop());
                }

                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }
}