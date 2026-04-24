public class Q1{
    // finding row with max 1 in a matrix
    public static int  bruteForce(int[][] arr){
        int max_COunt = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int countRow = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1){
                    countRow++;
                }
            }
            if(countRow > max_COunt){
                max_COunt= countRow;
                index = i;
            }
        }
        return index;
    }
    public static int lowerBound(int []arr, int x){
        int  low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid -1;
                

            }else{
                low =  mid + 1;
            }

        }
        return ans;
    }
    public static int optimal(int arr[][]){
        int maxCount = 0;
        int index = -1;
        
        for (int i = 0; i < arr.length; i++) {
            int fixindex =  lowerBound(arr[i], 1);
            int countOnes =  arr[0].length - fixindex;
            if(countOnes > maxCount){
                maxCount = countOnes;
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1}, {0, 0, 1}, {1, 1, 1}};
        System.out.println(bruteForce(matrix ));
        System.out.println(optimal(matrix));
    }
}