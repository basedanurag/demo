class Star_pattern{
    public static void main(String[] args) {
        int n = 100;
        // pattern 1
      /*   for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){
                System.out.print("*");
                System.out.println("*");
            }
            System.out.println(" ");

        }*/
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}