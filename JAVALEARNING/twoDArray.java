public class twodArray {
    public static void main(String[] args) {
       /*  int arr[][]  = {
        {1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
         for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("\n");
         }
    */
    int[][] arr = new int[3][3];
       matrixMult(arr);
    
    }
    static void matrixMult(int[][] arr){
        int mat1[][] = {{1,2,3}, {4,5,6},{7,8,9}};
        int mat2[][] = {{1,2,3}, {4,5,6},{7,8,9}};
        if(mat1[0].length != mat2.length){
            System.out.println("Invalid ");
            return;
        }
        else {
          for(int i = 0; i < mat1.length; i++) {
            for(int  j = 0; j < mat2.length; j++){
                arr[i][j] = 0;
                for(int k = 0; k < 3; k++){
                   arr[i][j] += mat1[i][k] * mat2[k][j];
                } 
            }
          }  
          for(int x[] :arr){
          for(int val : x){
            System.out.print(val + " ");
          
          }
            System.out.println("");
        }
        }
    }
}
