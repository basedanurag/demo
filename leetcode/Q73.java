public class Q73 {
    class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] temp = new int[m][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                temp[i][j] = matrix[i][j];
            }
        }  for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // if the element is 0 then set the entire row and column to 0
                // in the temp array
                  if(matrix[i][j] == 0){
                for(int k  = 0; k < n ; k++){
                  
                        temp[i][k] = 0;
                   
                    }
                    for(int k  = 0; k <m ; k++){
                  
                        temp[k][j] = 0;
                   
                    }
                }
            }
            
        }
        
        // copy the temp array to the original matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = temp[i][j];
            }
        }
        // return the original matrix       
    }
}
}

