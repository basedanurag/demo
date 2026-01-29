import java.util.Arrays;

public class Q11 {
    // set matrix 2D array 
    public static void printArr(boolean arr[]){
        for (boolean i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printMat(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j]+ ",");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        //TC : O((m * n)* (m + n)*(m * n)) ~ O(N^3)
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    for (int k = 0; k < n; k++) {
                        if(matrix[i][k] != 0){
                            matrix[i][k] = -1;
                        }
                        
                    }
                    for (int row = 0; row < m; row++) {
                        if(matrix[row][j] !=  0){
                            matrix[row][j] = -1;
                        }
                    }
                    
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j]= 0;
                }
            }
        }

        printMat(matrix);
    }
    public static void betterApproach(int[][] matrix){
        //TC O(N^2) sc : O(n).
        int m  =  matrix.length;
        int n =  matrix[0].length;
        boolean [] row  = new boolean[m];
        boolean [] col =  new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        
        }   
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
        printMat(matrix);
        printArr(row);
        printArr(col);
    }
    public static void optimalSol(int[][] matrix){
        int m =  matrix.length;
        int n = matrix[0].length;
        int col0 = 1;
        //  boolean [] row  = new boolean[m]; ---> matrix[..][0];
        //  boolean [] col =  new boolean[n]; ---> matrix[0][..];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                    // mark the ith row 
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    // mark the jth col
                    if(j != 0){
                    matrix[0][j] = 0;
                    }
                    else{
                    col0 = 0;
                    }
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(matrix[i][j] != 0 ){
                    //check the mark of row and col
                    if(matrix[i][0] == 0|| matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                    
                }
            }
        }
        if(matrix[0][0] == 0){
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        printMat(matrix);
    }
    

    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
       // setZeroes(matrix);
        System.out.println();
       // betterApproach(matrix);
        optimalSol(matrix);
    }
}
