public class Q13 {
    public static int bruteforce(int [] arr){
        int ans  = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i + 1]){
                ans  =  i - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,5,1};
        System.out.println( bruteforce(arr));
    }
}
