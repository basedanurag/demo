public class Q10 {
    public static int bruteForce(int [] arr){
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min( min, i);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(bruteForce(arr));
    }
}
