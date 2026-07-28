import java.util.Stack;

public class InFIXtoPreFix {
    public static int priority(char c) {

        if (c == '^') return 3;
        if (c == '*' || c == '/') return 2;
        if (c == '+' || c == '-') return 1;

        return -1;
    }

   static String infixToPrefix(String s) {

        // Reverse the infix expression
        StringBuilder sb = new StringBuilder(s).reverse();

        // Swap brackets
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')')
                sb.setCharAt(i, '(');
        }

        // Convert to postfix (modified associativity for reversed expression)
        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char ch : sb.toString().toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }

            else if (ch == '(') {
                st.push(ch);
            }

            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix.append(st.pop());
                }
                if (!st.isEmpty()) st.pop();
            }

            else {

                while (!st.isEmpty() &&
                        st.peek() != '(' &&
                        (priority(st.peek()) > priority(ch) ||
                        (priority(st.peek()) == priority(ch) && ch == '^'))) {

                    postfix.append(st.pop());
                }

                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }

        return postfix.reverse().toString();
    }
    public static void main(String[] args) {
        
    }
}
