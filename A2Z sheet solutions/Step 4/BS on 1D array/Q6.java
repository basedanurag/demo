public class Q6{
    public static int bruteforce(int arr[], int target){ // written by me 
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            int idx = -1;
            if(arr[i] == target){
                idx = i;
                res = Math.max(res, idx);
            }
            
        }
        return res;
    }
    public static int bruteforce2(int arr[], int target){
        // so the array is sorted i will traverse from back side to check the last occurance because all the element on the right will be bigger
       int n  =  arr.length;
        for (int i = n - 1; i >=0; i--) {
            if (arr[i] == target){
                return i; // this i learned from striver 
            }
        }
        return -1;
    }
    public static int optimal (int [] arr, int target){
        int low  = 0; // solved using upper bound code lol
        int high  =  arr.length - 1;
        int res = -1;
        while(low <= high){
            int mid  =  low + (high - low)/2;
            if(arr[mid] > target){
                res = mid - 1;
                high = mid - 1;
            }
            else{
               low = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int array[] = {3, 4, 13, 13, 13, 20, 40};
        System.out.println(bruteforce(array, 60));
        System.out.println(bruteforce2(array, 13));
        System.out.println(optimal(array, 13));
    }
}