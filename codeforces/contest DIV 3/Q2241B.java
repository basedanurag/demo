import java.util.Scanner;

public class Q2241B {
    public static boolean isGood(int num) {
        boolean[] seen = new boolean[10];

        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (!seen[digit]) {
                count++;
                seen[digit] = true;

                if (count > 2) {
                    return false;
                }
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int x = sc.nextInt();
            int y = 2;

            while (true) {

                int num = x * y;
                if (isGood(y)) {
                    if (isGood(num)) {
                        System.out.println(y);
                        break;
                    }
                }
                y++;
            }

        }
        sc.close();
    }
}
