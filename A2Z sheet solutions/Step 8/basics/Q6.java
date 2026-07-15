public class Q6 {
    // check the last bit which is set
    

    // better approach Brian kernighan 
    public static int removeLast2(int n){
        n  =  (n & n-1);
        return n;

    }
    public static void main(String[] args) {
        int n  = 12 ;
        System.out.println(n);
        n = removeLast2(n);
        System.out.println(n);
    }
}
