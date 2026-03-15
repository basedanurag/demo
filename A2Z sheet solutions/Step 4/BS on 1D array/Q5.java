public class Q5 {
    public static int getFloor(int [] arr, int target){
        int low  =0;
        int high = arr.length -1;
        int ans  = -1;
        while(low <= high){
            int mid  =  low + (high - low )/2;

            if(arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
            
        }
        return ans;
    }
    public static int getceil(int [] arr, int target){
        int low  =0;
        int high = arr.length -1;
        int ans  = -1;
        while(low <= high){
            int mid  =  low + (high - low )/2;

            if(arr[mid] >= target) {
                ans = arr[mid];
                high= mid - 1;
            }
            else{
                low = mid +1;
            }
            
        }
        return ans;
    }
    public static int[] getboth(int[] arr, int target){
        int floor = getFloor(arr, target);
        int ciel = getceil(arr, target);
        return new int[] {floor, ciel};
    }
    public static void main(String[] args) {
        int arr[] ={3, 4, 4, 7, 8, 10};
        int ans [] = new int[2];
        ans = getboth(arr, 5);

        for (int i : ans) {
            System.out.print(i+" ");
        }
      
    }
}
