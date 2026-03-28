public class Q12 {
    public static int bruteForce1(int[] arr){
       int result  = 0;
       if (arr.length == 1) return arr[0];
       
       for (int i = 0; i < arr.length - 1; i++) {
        if(i == 0){
            if(arr[i] != arr[i + 1]){
                result = arr[i];
            }
        }
        else if(i == arr.length - 1){
            if(arr[i] != arr[i - 1]){
                result = arr[i];
            }
        }
        else{
            if(arr[i] != arr[i -1] && arr[i] != arr[i + 1]){
            result = arr[i];
            }
        }
       }
       return result;
    }
    public static int bruteForce2(int[] arr){
        if(arr.length == 1) return arr[0];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
            
        }
        return ans;
    }
    public static int optimal(int[] arr){
        int low = 1;
        int high =  arr.length - 2;
        int n = arr.length;
        if (arr.length == 1) return arr[0];
        if(arr[n - 1] != arr[n - 2]) return arr[n -1];
        
        while(low  <= high){
            int mid  =  low + (high - low )/2;
            // check condition 
            if(arr[mid] != arr[mid + 1 ] && arr[mid] != arr[mid - 1]){
                return  arr[mid];
                
            }
            // if not matching then move left 
            if((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 == 1 && arr[mid ] == arr[mid - 1]) ){
                low  = mid + 1;
            }
            else{ // move right
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      //  int arr[] = {1,1,3,5,5};
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};

        System.out.println(bruteForce1(arr));
        System.out.println(bruteForce2(arr));
        System.out.println(optimal(arr));

    }
}
