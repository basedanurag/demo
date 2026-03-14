public class Q1 {
    public static int iterative(int [] arr, int low, int high, int target){
        while (low <= high){
            int mid =  (low + high)/2;
            if(arr[mid] == target) return mid;
            else if(  target> arr[mid]) low = mid + 1;
            else high = mid  - 1;
        }
        return -1;
    }
    public static int recursive(int [] arr, int low, int high , int target){
        int mid  = ( low + high)/2;
        if(low > high) return -1;
        int idx = -1;
        if(arr[mid] == target) return mid;
        else if ( target > arr[mid]) idx = recursive(arr, mid + 1, high, target);
        else idx = recursive(arr, low, mid - 1, target);

        return idx;
    }
    public static int OverFlowCase(int [] arr, int low, int high, int target){
        while (low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target) return mid;
            else if(  target> arr[mid]) low = mid + 1;
            else high = mid  - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,12};
        System.out.println(iterative(arr, 0,arr.length -1, 3));
        System.out.println(recursive(arr, 0, arr.length -1 , 4));
        System.out.println(OverFlowCase(arr, 0, arr.length - 1, 3));
    }
}