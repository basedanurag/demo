import java.util.Arrays;

public class Q4 {
    public static int bruteforce(int [] arr, int m, int k){
        if(arr.length < m * k) return -1;
        
        int low =  Arrays.stream(arr).min().getAsInt();
        int high  = Arrays.stream(arr).max().getAsInt();
        
        for (int i = low; i <= high; i++) {
                if(possible(arr, i, m, k)){
                    return i;
                }
        }
        return -1;
        

    }
    public static boolean possible(int[]arr, int day , int m , int k){
        int count = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
             if(arr[i] <= day){
                count++;

            }
             else{
                result += count/k;
                count = 0;
            }
        }
        result += count/k;
        if(result  >=  m){
               return  true;
        }

        return false;
    }
    public static int optimal(int arr[], int m , int k){
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2, k = 3;
        System.out.println(bruteforce(arr, m, k));
        int arr2[] = {1, 10, 3, 10, 2};
        int m2 = 3, k3 = 2;
        System.out.println(bruteforce(arr2,m2,k3));
    }
}