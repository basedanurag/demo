public class Q6 {
    public static int bruteforce(int[] arr){
        int sum = 0;
        int max = 0; // cause selling on higher and buying on lower always give the +ve result
        for(int i = 0 ; i < arr.length; i++){

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                sum = arr[j] - arr[i];
                max = Math.max(max, sum);
                }

            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(bruteforce(arr));
    }
}
