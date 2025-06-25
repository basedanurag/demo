public class Pattern {
    public static void main(String[] args){
       pattern4(5);
    }
    static void pattern4(int n){
        for(int i = 1; i <= 2*n - 1; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(""); // Move to the next line after each row
        }
    }
    static void pattern3(int n){
        for(int i = 1; i <=n; i++){
            for(int j  = 1; j <= i;j++){
                System.out.print(j+" ");
            }
            System.out.println(""); // Move to the next line after each row
        }
    }
    static void pattern2(int n ){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=n - i + 1; j++){
                System.out.print("* ");


            }
            System.out.println("");
        }
    }
    static  void pattern1(int n ){
          for(int i = 1; i <= 5; i++){
            for(int j  = 1; j<= 5; j++){
               if( j >= i){
                System.out.print("* ");
                }else{
                System.out.print("  ");
                }
            } 
            System.out.println(""); // Move to the next line after each row
        }
    }
}
