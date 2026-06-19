import java.util.Scanner;

public class Q2236B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt(); // total testcases 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            boolean possible = true;

            // Check each residue class modulo k
            for (int start = 0; start < k; start++) {

                int ones = 0;

                for (int i = start; i < n; i += k) {
                    if (s.charAt(i) == '1') {
                        ones++;
                    }
                }

                if ((ones & 1) == 1) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "yes" : "no");
        }

    }
}
