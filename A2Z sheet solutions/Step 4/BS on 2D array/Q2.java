public class Q2 {
    public static boolean bs(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid =  (low + high)/2;

            if(arr[mid] == target){
                return true;
            }else if (arr[mid] < target){
                low = mid + 1;
            }else{ 
                high =  mid - 1;
            }
            
        }
        return false;
    }
    public static boolean bruteforce(int[][] mat, int target){
        int n  = mat.length;
        int m =  mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(mat[i][j] == target) return true;
            }
        }
        return false;
    }
    public static boolean optimal(int[][] mat, int target){
        int n  = mat.length;
        int m =  mat[0].length;
        for (int i = 0; i < n; i++) {
            if(mat[i][0] <= target && target <=mat[i][m - 1] ){
                return bs(mat[i], target);
            }
        }

        return false;
    }
    public static boolean MostOptimal(int[][] mat, int target){
        int n  = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = (n * m - 1);
        while(low <= high){
            int mid =  (low  + high)/2;

            // this converts the 1 D coordinates to the 2D coordinates 
            int row =  mid/m;
            int col = mid%m;
            if(mat[row][col] == target){
                return true;
            }else if(mat[row][col] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println(bruteforce(matrix,11));
        System.out.println(optimal(matrix, 13));
        System.out.println(MostOptimal(matrix, 12));
    }
}
