import java.util.Scanner;

public class   Q1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        // represent the number of testcases 

        int n = sc.nextInt();
        while (n-- > 0) {
            
        
        int [] xy =  new int[2];
        for (int i = 0; i < xy.length; i++) {
            xy[i] = sc.nextInt();
        }

        if(xy[0] % 2 == 1 && xy[1] % 2== 1){
            System.out.println("NO");
        }else if(xy[0] %2 == 1 && xy[1] %2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("YES");
        }
    }
        sc.close();
    }
}