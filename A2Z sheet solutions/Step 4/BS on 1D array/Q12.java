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
  //
    public static void main(String[] args) {
        int arr[] = {1,1,3,5,5};
       // int arr[] = {1,1,2,2,3,3,4,5,5,6,6};

        System.out.println(bruteForce1(arr));

    }
}
