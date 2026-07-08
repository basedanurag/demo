import java.util.ArrayList;
import java.util.List;

public class  Q1{
    public static void generate (String curr, List<String> result , int n){
        // base case
        if(curr.length() == n){
            result.add(curr);
            return;
        }
        // hamesha 0 add karo
        generate( curr + "0", result, n);

        // agar khali hai ya last me 1 nahi hai to 1 add krdo
        if(curr.isEmpty()|| curr.charAt(curr.length() - 1) != 1){
            generate(curr + "1", result, n);
        }

    }
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        int n = 4;
        generate("", result, n);

        for (String string : result) {
            System.out.print(string + " ");
        }
    }
}