public class Pattern {
    public static void main(String[] args){
       pattern5(5);
    }
   static void pattern5(int n) {
    // Upper half
    for (int i = 1; i <= n; i++) {
        // Spaces before stars
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        // Stars on left side
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    // Lower half
    for (int i = n - 1; i >= 1; i--) {
        // Spaces before stars
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        // Stars on left side
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
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
    static void pattern1(int n ){
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
