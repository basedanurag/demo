import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int x, rem, rev;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the integer");
        x = s.nextInt();

        // If the number is negative or ends with 0 but is not 0, it cannot be a palindrome
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            System.out.println("false");
            s.close();
            return;
            
        }

        rev = 0;
        // Reverse half of the number
        while (x > rev) {
            rem = x % 10; // Get the last digit
            rev = rev * 10 + rem; // Build the reversed half
            x /= 10; // Remove the last digit
        }

        // Check if the number is a palindrome
        // For odd-length numbers, the middle digit is ignored with rev / 10
        if (x == rev || x == rev / 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
            s.close();
        }
    }
}
