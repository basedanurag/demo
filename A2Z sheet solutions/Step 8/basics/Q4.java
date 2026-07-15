public class Q4{
    //clearing the set bit
    public static int clearIthBit(int num, int i){
        num =  (num & ~(1<<i));
        return num;
    }
    public static void main(String[] args) {
        int n  = 9;
        int i = 3;

        System.out.println(n);
        n = clearIthBit(n, i);
        System.out.println(n);
    }
}