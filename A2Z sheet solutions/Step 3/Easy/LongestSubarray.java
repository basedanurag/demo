public class LongestSubarray {

    public static int subArray(int[] arr, int n){
        int len = 0;
        // for i pointer 
        for(int i= 0; i < arr.length; i++){
            // for j pointer 
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                //ye lopp check karega for in range btw i to j 
                for (int k = i; k <= j; k++) {
                    sum += arr[k];          
                }
                if(sum  == n ){
                        len  = Math.max(len, j - i + 1);
                    }
            }
        }
        System.out.println("the longest subarray length is "+ len );
        return len;
    }

    public static void main(String[] args) {
         int[] arr = {1,2,1,1,5,6};
         subArray(arr, 3);
    }
}
