import java.util.Scanner;

public class Watermelon {
    public static void solution(int x){
        if(x %2 == 0 && x >2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        solution(x);
        sc.close();
    }
}
