public class Q13 {
    public static int bruteforce(int [] arr){
        int ans  = -1;
        if(arr.length == 1) return 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i + 1]){
                return ans  =  i ;
            }
        }
        return ans;
    }
    public static int optimal(int[] arr){
        int low  = 0;
        int high =  arr.length - 1;
        if(arr.length == 1) return 0;
        while(low  < high){
            int mid =  low  + (high - low) / 2;

            if(arr[mid] > arr[mid + 1]){
                high  = mid;
            }
            else{
                low = mid  + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8,5,1};
        int arr[] = {1,2,1,3,5,6,4};
        System.out.println(bruteforce(arr));
        System.out.println(optimal(arr));
    }
}
