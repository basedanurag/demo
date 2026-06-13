public class Q4 {

    // // this only works when the input is less than max int value
    // public static int solve(String s) {
    //     int num = 0;
    //     StringBuilder numString = new StringBuilder();
    //     boolean started = false;
    //     for (int i = 0; i < s.length(); i++) {

    //         char ch = s.charAt(i);

    //         if (!started && ch == ' ') {
    //             continue;
    //         }

    //         if (!started && (ch == '+' || ch == '-')) {
    //             numString.append(ch);
    //             started = true;
    //             continue;
    //         }

    //         if (Character.isDigit(ch)) {
    //             numString.append(ch);
    //             started = true;
    //         } else if (started) {
    //             break;
    //         } else {
    //             return 0;
    //         }
    //     }
    //     num = Integer.parseInt(numString.toString());

    //     if (num > 2147483647) {
    //         return Integer.MAX_VALUE;
    //     } else if (num < -2147483648)
    //         return Integer.MIN_VALUE;
    //     return num;
    // }

    // solving using helper function and recursive approach 

   


    static final int INT_MIN_VAL = -2147483648;
    static final int INT_MAX_VAL = 2147483647;

    // Recursive helper
    static int helper(String s, int i, long num, int sign) {
        // Base case: end or non-digit
        if (i >= s.length() || !Character.isDigit(s.charAt(i)))
            return (int)(sign * num);

        // Update num
        num = num * 10 + (s.charAt(i) - '0');

        // Clamp overflow
        if (sign * num <= INT_MIN_VAL) return INT_MIN_VAL;
        if (sign * num >= INT_MAX_VAL) return INT_MAX_VAL;

        // Recurse
        return helper(s, i + 1, num, sign);
    }

    static int solve(String s) {
        int i = 0;

        // Skip whitespaces
        while (i < s.length() && s.charAt(i) == ' ') i++;

        // Handle sign
        int sign = 1;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Recursive helper
        return helper(s, i, 0, sign);
    }




    public static void main(String[] args) {
        String s = "4193 with words";
        String s2 = "0-1";
        System.out.println("output for 1st case " + solve(s));
        System.out.println("output for 2nd case " + solve(s2));
    }
}
