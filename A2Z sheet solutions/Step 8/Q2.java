public class Q2 {
    // check if the ith bit is set or not 
    public static String reverse(String s ){
        char c[] = s.toCharArray();
        int left  =0;
        int right = s.length()-1;
        String newString;
        while (left < right) {
            char temp  = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
        newString = new String(c);
        return newString;
    }
    
    public static String convert2Binary(int num){
        StringBuilder res = new StringBuilder();
        while (num > 0) {
            if(num % 2 == 1) res.append('1');

            else res.append('0');

            num /=2;
        }
        String s  = res.toString();
        String reverse =  reverse(s);
        return reverse;
    }
    // right bit operator
    public static boolean checkIthBitRight(int num, int i){
        if((1 &(num >> i)) != 0){
            return true;
        }
        return false;
    }
    // left bit operator 
    public static boolean checkIthBitLeft(int num, int i){
        if((num &(1 << i)) != 0){
            return true;
        }
        return false;
    }
    //brute force 
    public static boolean checkIthBit(int num , int i){
        // brute force is first convert to binary then traverse from back
        String s  =  convert2Binary(num);
        return s.charAt(s.length() - 1 - i) == '1';
    }
    public static void main(String[] args) {
        int num = 13;
        int i =  2;
        System.out.println(checkIthBit(num, i)); // brute force 
        System.out.println(checkIthBitLeft(num, i)); // left operator
        System.out.println(checkIthBitRight(num, i)); // right operator
    }
}
