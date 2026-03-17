public class Q8{
    public static int bruteforce(int [] arr, int target){
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                idx = i;
            
            }
        }
        return idx;
    }
    public static int binarySearch(int[] arr, int target){
        int low  = 0; 
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high  - low)/ 2;

            if(arr[mid] == target) {
                return mid;
            }
            if(arr[low] <= arr[mid]) {
                // if left part is sorted
                if(arr[low]<= target && target < arr[mid]){
                    high = mid - 1;
                }
                else {
                    low  = mid + 1;
                }
            }else{
                if(arr[mid] < target &&  target < arr[high]){
                    low  = mid +1 ;

                }
                else {
                    high = mid - 1;
                }
            }
            
        }
        return - 1;
    }
    public static void main(String[] args) {
         int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(bruteforce(nums, target));
        System.out.println(binarySearch(nums, target));
    }
}