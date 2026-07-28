import java.util.Stack;

public class PostFixtoInFix {
    public static String func(String s ){
        Stack<String > st  = new Stack<>();
        StringBuilder sb =  new StringBuilder();
       
        for(char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                st.push(Character.toString(c));
            }
            else {
                String t1 = st.pop();
                String t2 =  st.pop();
                sb.append('(' + t2 + c + t1 + ')');
                st.push(sb.toString());
                sb.setLength(0);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        
    }
}
