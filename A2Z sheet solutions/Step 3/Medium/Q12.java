public class Q12 {
    public static void bruteForce(int[][] arr){
        int m = arr.length;
        int n  = arr[0].length;
        int [][] ans =  new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                ans[j][m -1 -i] = arr[i][j];
            }
        }
        printMat(ans);
    }
    public static void optimalSol(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
         for (int i = 0; i < m; i++) {
            for (int j = i + 1 ; j < n; j++) {
                int temp =  arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
         for(int i = 0; i < m; i++){
            int low = 0;
            int high = m -1;    

            while(low < high){
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++;
                high--;
            }

        }
        printMat(arr);
    }
     public static void printMat(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j]+ ",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] ans = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}}; // m must be equal to n 
       // bruteForce(ans);
        System.out.println();
        optimalSol(ans);
    }
}
