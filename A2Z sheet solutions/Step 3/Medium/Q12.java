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
     public static void printMat(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j]+ ",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] ans = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        bruteForce(ans);
    }
}
