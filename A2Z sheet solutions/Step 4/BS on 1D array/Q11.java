public class Q11 {
    public static int bruteForce(int[] arr) {
        int small = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            small = Math.min(small, arr[i]);
            if (arr[i] == small) {
                idx = i;
            }
        }
        return idx;
    }
    public static int better(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                return i+ 1;
            }
        }
        return 0; // if no rotation found 
    }
    public static int optimal(int [] arr){
        int idx = -1;
        int ans  = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int mid = low + (high - low )/2;
            if ( arr[low] <= arr[high]){
                 if(arr[low] < ans){
                    idx = low;
                    ans = arr[low];
                 }
                 break;
            }
            if(arr[low] <= arr[mid]){
                 if(arr[low] < ans){
                    idx = low;
                    ans = arr[low];
                 }
                 low = mid + 1;
            }else{
                high = mid  - 1;
                 if(arr[mid] < ans){
                    idx = mid;
                    ans = arr[low];
                 }
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};

        System.out.println(bruteForce(arr));
        System.out.println(better(arr));
        System.out.println(optimal(arr));
    }
}
