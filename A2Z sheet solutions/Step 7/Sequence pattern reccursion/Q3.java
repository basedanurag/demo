import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void generate(String s,String curr, List<String> result, int index) {
        
        if(index == s.length()){
            result.add(curr);
            return;
        }
        // take 
       generate(s ,curr + s.charAt(index), result, index + 1);
        // not take
       generate(s,curr, result, index + 1);

    }
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
       String s  = "abc";
        generate(s,"", result, 0);

        for (String string : result) {
            System.out.print(string + " ");
        }
    }
}
