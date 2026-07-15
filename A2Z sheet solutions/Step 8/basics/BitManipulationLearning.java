public class BitManipulationLearning{
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
    public static int convertBinary2Decimal(String s){
         int len  =  s.length(); 
         int num =0;
         int p2 = 1;

         for(int i =  len - 1; i >= 0 ;i--){
            if(s.charAt(i) == '1'){
                num += p2;
            }
            p2 = p2 * 2;
         }
         return num;
    }
    public static void main(String[] args) {
        int n  =  5;
        String s =  convert2Binary(n);
        for(int i = 0 ; i < s.length(); i++) {
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
        System.out.println(convertBinary2Decimal(s));
        
    }
}