public class Q5 {
    // toggeling the ith bit 
    public static int toggleIthBit(int num , int i){
        num =  (num ^(1<<i));
        return num;
    }
    public static void main(String[] args) {
        int n  = 13,i = 2;
        System.out.println(n);
        n  = toggleIthBit(n, i);
        System.out.println(n);
    }
}
