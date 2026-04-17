import java.util.Arrays;

public class Q8{
    public static boolean checkPossible(int [] arr , int distance, int cows){
        int countCows  = 1;
        int last =  arr[0];
        for (int i = 1; i < arr.length; i++) {
            if((arr[i] -  last) >= distance ){
                countCows++;
                last = arr[i];

            }

        }
        if(countCows >= cows) return true;

        return false;
    }
    public static int bruteForce(int[] arr, int cows){
        Arrays.sort(arr);
        int min = arr[0];
        int max =  arr[arr.length - 1];
        int ans = 0;

        for (int i = 1; i <= (max  - min); i++) {
            if(checkPossible(arr, i, cows)){
                ans  =  i;
            }
        }
        return ans;
    }
    public static int optimal(int arr[], int cows){
        // Arrays.sort(arr);
        // int min  =  arr[0];
        // int max = arr[arr.length - 1];
       int max = Arrays.stream(arr).max().getAsInt();
       int min =  Arrays.stream(arr).min().getAsInt();
       int low =  1;
       int maxDistance =  max - min;
       int ans  = 0;


       while (low <= maxDistance) {
        int mid =  (maxDistance + low)/2;

        if(checkPossible(arr, mid, cows)){
            ans  = mid;
            low =  mid + 1;
        }else{
            maxDistance =  mid - 1;
        }
        
       }
       return ans;

    }
    public static void main(String[] args) {
    //    int cows = 2, arr[] = {4,2,1,3,6};
      int cows = 4, arr[] = {0,3,4,7,10,9}; 
        System.out.println(bruteForce(arr, cows));
        System.out.println(optimal(arr, cows));
    }
}