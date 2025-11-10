public class ArrayRotationDemo {
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
    public static void main(String[] args) {
            int[] arr = {3,1,31,4,5,6};
            //bruteforceRotaation(arr);
            optimalRotation(arr);
    }
}
