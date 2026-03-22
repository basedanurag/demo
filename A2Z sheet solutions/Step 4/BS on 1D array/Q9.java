public class Q9{
    public static boolean bruteforce(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target){
                return true;
            }
        }
        return false;
    }
    public static boolean searchInRotatedSortedArrayII(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // If mid element is the target
            if (arr[mid] == k) return true;

            // Handle duplicates: cannot determine sorted side
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    high = mid - 1; // Search left
                } else {
                    low = mid + 1;  // Search right
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] <= k && k <= arr[high]) {
                    low = mid + 1;  // Search right
                } else {
                    high = mid - 1; // Search left
                }
            }
        }

        return false; // Not found
    }
   
    public static boolean search(int[] nums, int target) {
        int low = 0;
        int high =  nums.length - 1;
        while(low <= high){
            int mid = low + (high - low )/2;

            if(nums[mid] == target) return true;

            // handeling duplicates 
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }
            //left side sorted 
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                } 
                // right side sorted
            }else{
                 if(nums[mid] <= target && target <= nums[high]){
                   low  = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 9;
        System.out.println(bruteforce(arr, k));
        System.out.println(searchInRotatedSortedArrayII(arr, k));
        System.out.println(search(arr, k));
    }
}