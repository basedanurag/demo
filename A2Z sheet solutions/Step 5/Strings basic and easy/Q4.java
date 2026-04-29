import java.util.Arrays;

public class Q4{
    public static String longestCommonPrefix(String[] sarr){
        StringBuilder  res =  new StringBuilder();
        Arrays.sort(sarr);

        String first =  sarr[0];
        String last =  sarr[sarr.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if(first.charAt(i) != last.charAt(i)){
                return res.toString();
            }

            res.append(first.charAt(i));
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String[] input = {"interview", "internet", "internal", "interval"};
        System.out.println(longestCommonPrefix(input));
    }
}