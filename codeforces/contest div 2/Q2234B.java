import java.util.Scanner;

public class Q2234B {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long []pal =  {0,1,2,3,4,5,6,7,8,9,22,11};
        int n = sc.nextInt();
        while (n-- > 0) {
            long sum = sc.nextLong();
            long a  =  pal[(int) (sum %12)];
            long b  =  sum - a;

            if(b >= 0){
                System.out.println(a+ " "+ b);
            }
            else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
