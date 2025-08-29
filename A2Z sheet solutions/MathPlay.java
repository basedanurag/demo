import java.util.ArrayList;
import java.util.Scanner;

public class MathPlay {
    public boolean isPalindrome(int x) {
        String s = new String();
        s = Integer.toString(x);
        int n = s.length();
        if (n == 1) {
            return true;
        }
        for (int i = 0; i <= n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int rev = 0;
        int num = x;
        while (num != 0) {
            int last = num % 10;
            rev = (rev * 10) + last;
            num = num / 10;
        }
        return (rev == x);
    }

    public int countDigits1(int n) {
        int count = 0;
        while (n > 0) {
            int last = n % 10;
            System.out.println("the last digit is " + last);
            count += 1;
            n = n / 10;
        }
        System.out.println("Total digits: " + count);
        return count;
    }

    public int countDigits2(int n) {
        // Using logarithm method
        int count = (int) (Math.log10(n) + 1);
        return count;
    }

    public int reverse(int n) {
        int num = Math.abs(n);
        int rev = 0;
        while (num != 0) {
            int last = num % 10;
            if (rev > (Integer.MAX_VALUE - last) / 10) {
                return 0;
            }
            rev = (rev * 10) + last;
            num = num / 10;
        }
        return (n < 0) ? (-rev) : rev;
    }

    public int Gcd(int n1, int n2) {
        if (n1 == 0)
            return n2;

        if (n2 == 0)
            return n1;

        return Gcd(Math.max(n1, n2) % Math.min(n1, n2), Math.min(n1, n2));
    }

    public boolean ArmStrongNumber(int num) {
        int n = String.valueOf(num).length();
        int og = num;
        int ArmStrongNumber = 0;
        while (num > 0) {
            int last = num % 10;
            ArmStrongNumber += Math.pow(last, n);
            num /= 10;
        }
        return (ArmStrongNumber == og);

    }

    public static ArrayList<Integer> allDivisior(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int sqrt = (int)Math.sqrt(n);
        for (int i = 1; i<= sqrt; i++) {
            if (n % i == 0) {
                res.add(i);
                //
                if (i != n / i) {
                    res.add(n/i);
                }
            }
        }
        return res;
    }
    public boolean isPrime(int n){
        int count = 0;
        for(int i = 1; i* i <=n ; i++){
            if (n % i == 0){
                count++;
            }
            if(i != n /i){
                count++;
            }
        }
        return (count == 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of x");

        int x = sc.nextInt();

        MathPlay m = new MathPlay();

        // Method 1
        m.countDigits1(n);
        System.out.println(m.reverse(x));
        // Method 2
        System.out.println("Total digits (log method): " + m.countDigits2(n));
        System.out.println(m.isPalindrome(n));
        System.out.println(m.isPalindrome2(x));
        System.out.println(m.Gcd(n, x));
        System.out.println(n + "is a Arm strong number  " + m.ArmStrongNumber(n));
        ArrayList<Integer> divisors = allDivisior(n);
        System.out.println("is primenumber " + m.isPrime(n));
        System.out.print("Divisors of " + n + " are: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        sc.close();

    }
}
