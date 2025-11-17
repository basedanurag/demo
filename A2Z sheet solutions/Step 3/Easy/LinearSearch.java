public class LinearSearch {
    public static boolean search(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                System.out.println("found at index "+ i);
                return true;
            }
        }
        System.out.println("not found in array");
        return false;
    }
    public static void main(String[] args) {
         int[] arr = {0,1,0,0,5,6};
         search(arr, 6);
    }
}
