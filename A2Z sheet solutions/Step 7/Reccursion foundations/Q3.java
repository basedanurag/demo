public class Q3{
    static final int MOD = 1000000007;

    public static int power(int x, long n) {
        if (n == 0)
            return 1;

        int half = power(x, n / 2);

        long result = (1L * half * half) % MOD;

        if (n % 2 == 1) {
            result = (1L * x * result) % MOD;
        }

        return (int) result;
    }

    public static int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        return (int) ((1L * power(5, even) * power(4, odd)) % MOD);
    }
    public static void main(String[] args) {
        
    }
}