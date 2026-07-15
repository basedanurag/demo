public class Q1{
    static int a,b;
    public static void swap(){
        a  = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        // swap two numbers 
         a  =  10;
         b  =  20;
        swap();

        System.out.println(a+" "+ b);
    }
}