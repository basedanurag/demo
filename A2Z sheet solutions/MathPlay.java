public class MathPlay {
    public boolean isPalindrome(int x) {
        String s = new String();
        s = Integer.toString(x);
        int n = s.length();
        if (n == 1){
            return true;
        }
            for(int i = 0 ; i <= n/2; i++){
                if (s.charAt(i) != s.charAt(n - i - 1)){
                    return false;
                }
            }
        return true;
    }
    public boolean isPalindrome2(int x) {
        if(x < 0 || ( x % 10 == 0 && x != 0))
         return false;
      int rev =  0;
      int num = x;
      while( num != 0){
        int last = num % 10;
        rev = (rev * 10 ) + last;
            num = num/10;
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
        int count = (int)(Math.log10(n) + 1);
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

    public static void main(String[] args) {
        int n = 123454321;
        int x = 1000000001;

        MathPlay m = new MathPlay();
        
        // Method 1
        m.countDigits1(n);
        System.out.println(m.reverse(x));
        // Method 2
        System.out.println("Total digits (log method): " + m.countDigits2(n));
        System.out.println(m.isPalindrome(n));
        System.out.println(m.isPalindrome2(x));
        
    }
}
