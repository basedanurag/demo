public class Q1 {
    public static int reccursionHelper(String s, int i, long num, int sign) {
        int l = s.length();
        // base case kya hai 
        // agar i length se bahar chala gya ya character digit nahi hai
        while (i >=l || !Character.isDigit(s.charAt(i))) {
            return (int) (sign * num);
        }

        num = num * 10 + s.charAt(i) - '0';
        if(sign * num >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(sign * num <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return reccursionHelper(s, i + 1, num, sign);

    }

    public static int myAtoi2(String s) {
        int i = 0;
        int l = s.length();

        while (i < l && Character.isWhitespace(s.charAt(i))) {
            i++;

        }
        int sign = 0;

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        return reccursionHelper(s, i, 0, sign);

    }

    public static int myatoi(String s) {
        int i = 0;
        int l = s.length();
        int num = 0;
        int max = Integer.MAX_VALUE / 10;
        int min = Integer.MIN_VALUE / 10;
        boolean negative = false;
        // ignoring white spaces
        while (i < l && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        if (i == l) {
            return 0;
        }
        // check the sign
        char sign = s.charAt(i);
        if (sign == '+') {
            i++;
        } else if (sign == '-') {
            negative = true;
            i++;
        }
        // any other character
        if (i < l && !Character.isDigit(s.charAt(i))) {
            return 0;
        }
        if (i == l)
            return 0;
        // leading 0
        while (i < l && s.charAt(i) == '0') {
            i++;
        }
        if (i == l)
            return 0;

        // extract integers
        while (i < l && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (num > max) {
                return Integer.MAX_VALUE;
            } else if (num == max && digit > 7) {
                return Integer.MAX_VALUE;
            }
            if (num < min) {
                return Integer.MIN_VALUE;
            } else if (num == min && digit > 8) {
                return Integer.MIN_VALUE;
            }
            if (negative) {
                num = num * (10 + (-digit));
            } else
                num = num * (10 + digit);

            i++;
        }

        return num;
    }

    public static void main(String[] args) {

    }
}