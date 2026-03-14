public class Q2 {
    public static int bruteforce(int[]arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= target) return i ;
        }
        return arr.length;
    }
    public static int optimal(int arr[], int target){
        int low  = 0;
        int high  = arr.length - 1;
        while(low <= high){
            int mid  =  low  + (high  - low )/2;

            if(arr[mid] >= target) return mid;
            else if(target> arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int [] arr = {3,5,8,15,19};
        int [] arr2 =  {1,2,2,3};
        System.out.println(bruteforce(arr, 9));
        System.out.println(optimal(arr, 9));
        System.out.println(optimal(arr2, 2));
    }
}
