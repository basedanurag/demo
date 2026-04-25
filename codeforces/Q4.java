import java.util.Scanner;

public class  Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =  sc.nextInt();
        int count = 0;
        while(n-- > 0){
            
            String s  = sc.next();

            if(s.contains("--")){
                count--;
            }
            else if(s.contains("++")){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}