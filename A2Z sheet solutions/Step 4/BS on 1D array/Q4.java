public class Q4 {
    public static int solution(int [] arr, int target){
                int low  =  0;
        int high = arr.length - 1;
        while(low <= high){
            int mid  = low + (high - low )/ 2;
            if (arr[mid] == target ) return mid;
            else if ( target > arr[mid]) low = mid + 1;
            else high  = mid - 1;
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,7};
        System.out.println(solution(arr, 2));
    }
}
