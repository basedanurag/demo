public class Q2 {
    public static int bruteforce(int n , int m){
       int ans = -1;
       for (int i = 1; i < m; i++) {
            ans = (int ) Math.pow(i,n);

            if(ans == m) return i;

            if (ans > m) break;

       }
       return -1;
    }
    public static int optimal(int n , int m){
        int low = 1;
        int high = m/2;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            long val =1;

            for (int i = 0; i < n; i++) {
                val *= mid;
                if(val > m) break;
            }
            if (val == m ){
               
                
                return mid;
            }
            else if ( val < m){
                 low = mid + 1 ;
            }
            else{
                high = mid - 1;
            }
        }
       
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(bruteforce(3, 27));
        System.out.println(bruteforce(4, 69));
        System.out.println(bruteforce(2, 16));
        System.out.println();
        System.out.println(optimal(3, 27));
        System.out.println(optimal(4, 69));
        System.out.println(optimal(2, 16));
    }
}