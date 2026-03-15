public class Q3 {
    public static int bruteforce(int[] arr, int target){
        int n  = arr.length;
        for (int i = 0; i <n; i++) {
            if(arr[i] > target){
                return i;
            }
        }
        return n;
    }
    public static int optimal(int [] arr , int target){
        int low  =  0;
        int high = arr.length - 1;
        while(low <= high){
            int mid  = low + (high - low )/ 2;
            if (arr[mid] > target ) return mid;
            else if ( target > arr[mid]) low = mid + 1;
            else high  = mid - 1;
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,8,9,15,19};
        System.out.println(bruteforce(arr, 9));
        System.out.println(optimal(arr, 9));
    }
}