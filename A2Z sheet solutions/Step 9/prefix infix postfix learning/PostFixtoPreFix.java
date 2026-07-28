import java.util.*;

public class PostFixtoPreFix {

    static String convert(String s) {

        Stack<String> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {

                String op2 = st.pop();
                String op1 = st.pop();

                String exp = ch + op1 + op2;

                st.push(exp);
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {

        String postfix = "ab+c*";

        System.out.println(convert(postfix));
    }
}