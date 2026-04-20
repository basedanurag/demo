import java.util.Arrays;

public class Q9{
    public static boolean allocationisPossible(int[] arr, int mid, int students){
        int allocatedStudents = 1;
        int pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > mid) return false;

            if(pages + arr[i] > mid ){
                allocatedStudents++;
                pages += arr[i] ;
              
            }
            else{
                pages+= arr[i];

            }
        }
          if(allocatedStudents > students ){
                    return false;
            }
        return true;
    }
    public static int optimal(int [] arr, int students){
        int low = Arrays.stream(arr).min().getAsInt();
        int high =  Arrays.stream(arr).sum();
        int res = -1;
        if(arr.length < students) return -1;
        while(low <= high){
            int mid =  low + (high - low )/2;

            if(allocationisPossible(arr,mid, students)){
                res = mid;
                high = mid - 1;
            }else{
                low =  mid +1;
            }
        }   
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};
        int students = 2;
        System.out.println(optimal(arr, students));
    }
}