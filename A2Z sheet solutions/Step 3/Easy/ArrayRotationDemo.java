public class ArrayRotationDemo {
    // left rotation by 1 place
    public static void bruteforceRotaation(int[] arr){
        int n  = arr.length;
        int temp[] = new int[n];
        for(int i = 1; i < n; i++){
            temp[i - 1 ] = arr[i];
        }
        temp[n - 1] = arr[0];

        for(int a:  temp){
            System.out.print(a + " ");
        }
    }
    public static void optimalRotation(int[] arr){
        int n  = arr.length;
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i ] = arr[i + 1];
        }
        arr[n - 1] = temp;
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
    // left rotation by D places 
    public static void bruteforceRotation(int[]arr, int a){
        int n  =  arr.length;
        a = a%n;
        int[] temp = new int[a];  
        //copying a temporary array which need to be rotated
        for(int i = 0; i < a; i++){
            temp[i] = arr[i];
        } 
        //actual left rotation
        for(int i = 0; i < n - a; i++){
            arr[i] = arr[i+ a];
        }
        //inserting the 1st elements in the last
        for(int i = n - a; i < n; i++){
            arr[i] = temp[i- (n -a)];
        }
        // printing the array
        for (int x : arr)
        System.out.print(x +" ");
    }
    //right rotation by d places 
    public static void rightrotationbrute(int[]arr, int d){
        int n  =  arr.length;
        d = d % n;
        int temp[] = new int[d];
        //copying a temporary array which need to be rotated
        for(int i = 0; i < d; i++){
            temp[i] = arr[n - d + i];
        } 
          //actual right rotation
        for(int i = n - d - 1; i >= 0; i--){
            arr[i+d] = arr[i];
        }
        //inserting the last elements in the first
        for(int i = 0; i <d; i++){
            arr[i] = temp[i];
        }
        // printing the array
        for (int x : arr)
        System.out.print(x +" ");
        
    }

    public static void main(String[] args) {
            int[] arr = {3,1,31,4,5,6};
            //bruteforceRotaation(arr);
           // optimalRotation(arr);
         //  bruteforceRotation(arr, 4);
         rightrotationbrute(arr, 1);

    }
}
