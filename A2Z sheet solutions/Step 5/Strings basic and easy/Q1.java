import java.util.Stack;

public class Q1 {
    public static void solve(String s){
        int start =0;
       int end =0;
       int sum = 0;
       StringBuilder  res = new StringBuilder();
       while(end < s.length()){
            if(s.charAt(end) == '(')sum++;
            else sum--;

            if(sum == 0){
                res.append(s.substring(start + 1, end));
                start = end + 1;
                
            }
       }
    }
    public static void main(String[] args) {
       
    }
}