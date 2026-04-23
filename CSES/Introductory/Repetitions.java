
import java.util.Scanner;

public class Repetitions {
    public static int solve(String s){
        int ans = 0;
        int n  = s.length();
        int count = 1;
        if(s.length() == 1) return 1;
        for (int i = 1; i < n; i++) {
            if(s.charAt(i) == s.charAt(i - 1)) count++;
            else count = 1;

            ans = Math.max(ans, count);
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
        sc.close();
    }
}
