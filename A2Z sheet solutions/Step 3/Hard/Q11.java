import java.util.ArrayList;

public class Q11 {
    public static int bruteforce(int[] arr){ // Reverse Pairs are those pairs where i<j and arr[i]>2*arr[j].

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if(arr[i] > 2 * arr[j]) count++;
            }
        }
        return count;
    }
    public static void merge(int[] arr, int low , int mid , int high){
        ArrayList<Integer> temp = new ArrayList<>();
       
        int left = low;
        int right = mid + 1;
        
        while(left <= mid && right <= high ){
            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;

            }
            else {
                temp.add(arr[right]);
                right++;
            }
           
            while(left <= mid){
               temp.add(arr[left]);
                left++;

            }
            while(right <= high){
               temp.add(arr[right]);
                right++;

            }
            for (int i = low; i <=  high; i++) {
                arr[i] = temp.get(i - low);
            }
        }
    }
    public static int countPairs(int[] arr, int low , int mid , int high){
        int count = 0;
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
             while(right <= high && arr[i] > 2 * arr[right])right++;

             count += (right - (mid + 1));
        }
        return count;
       
    }
    public static int mergeSort(int[] arr,int low , int high){
            int count = 0;
            if(low >= high) return count;
            int mid = (high + low)/2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid+ 1, high);
            count += countPairs(arr, low, mid, high);
            merge(arr, low, mid, high);
        
        return count;
    }
    public static void main(String[] args) {
       int[] arr = {3,2,1,4};
       System.out.println(bruteforce(arr));
       System.out.println(mergeSort(arr, 0, arr.length - 1));
    }
}
