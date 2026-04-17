

public class Q7 {
    public static int bruteForce(int[] vec, int k){
        for (int i = 0; i < vec.length; i++) {
            if(vec[i] <= k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
     public static int optimal(int[] vec, int k){
        int low = 0;
        int high = vec.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int missing  = vec[mid] - (mid + 1);

            if(missing < k){
                low = mid + 1;
            }
            else{
                high =  mid - 1 ;
            }
        }
        return k + high + 1;
     }
  
    public static void main(String[] args) {
        int vec[]={4,7,9,10};
        System.out.println(bruteForce(vec, 4));
        System.out.println(optimal(vec, 4));
    }
}
