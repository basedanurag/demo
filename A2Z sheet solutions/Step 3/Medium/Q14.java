public class Q14 {
    public static int bruteforce(int[]arr, int n){
        int  count =0;
        for(int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }


                if(sum == n){
                    count++;
                }
            
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
       System.out.println( bruteforce(arr, 6));
    }
}