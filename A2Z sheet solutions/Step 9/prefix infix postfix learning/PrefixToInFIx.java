import java.util.Stack;

public class PrefixToInFIx {
    static String convert(String s) {

        Stack<String> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {

                String op2 = st.pop();
                String op1 = st.pop();

                String exp = "(" + op1 + ch + op2 + ")";

                st.push(exp);
            }
        }

        return st.pop();
    }
    public static void main(String[] args) {
        
    }
}
