import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //number of  test cases 
        int n = sc.nextInt();
       
        while(n-- > 0){
             int countOpen = 0; // count number of (
            int countClose = 0; // count number of )
            int len = sc.nextInt();
            String s =  sc.next();
            for (int i = 0; i < len; i++) {
                if(s.charAt(i) == '(' ) countOpen++;
                
                if(s.charAt(i) == ')') countClose++;

            }
            if(countClose == countOpen) System.out.println("YES");
            else System.out.println("NO");
           
            
        }
        sc.close();
    }
}
