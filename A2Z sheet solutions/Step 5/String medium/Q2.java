public class Q2 {
    public static  int maxDepth(String s) {
        int Max = 0;
        int countOpen = 0;
        if(s.length() < 2) return 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                countOpen +=1;
                Max = Math.max(Max, countOpen);
            }
            else if(s.charAt(i) == ')'){
                countOpen -= 1;
            }
           
        }
        return Max;
    }
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }
}
