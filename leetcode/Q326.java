class Solution {
    public boolean isPowerOfThree(int n) {
       
        return (n >= 0) && (Math.pow(3, 19) % n == 0);
    }
}
public class Q326 {
    public static void main(String[] args) {
        Solution s = new Solution();
       System.out.println( s.isPowerOfThree(27));
    }
}
// i tested my self 