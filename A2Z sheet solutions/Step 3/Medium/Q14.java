public class Q14 {
    public static int bruteforce(int[]arr, int n){
        int  count =0; //TC O(n^3)
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
    public static int betterapproach(int[]arr, int k){
        int count= 0;
        int sum  = 0;
        for (int i = 0; i < arr.length; i++) {
            sum =0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if(sum == k)count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
       System.out.println( bruteforce(arr, 6));
       System.out.println(betterapproach(arr, 6));
    }
}