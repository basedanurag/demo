public class Q10 {
    public static int bruteForce(int [] arr){
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min( min, i);
        }
        return min;
    }
    public static int optimalAproach(int[] arr){
        
        int low  = 0;
        int high  =  arr.length - 1;
        if(arr.length == 1) return arr[low];

        while (low < high) {
            int mid = low + (high - low)/2;
            // check for last element and first element
            if ( arr[mid] > arr[high]){
                low = mid + 1;
            }else {
                high  = mid ;
            }
            
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(bruteForce(arr));

        System.out.println(optimalAproach(arr));
    }
}
