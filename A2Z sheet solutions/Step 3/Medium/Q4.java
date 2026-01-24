public class Q4 {
    public static int MaxSum(int[] arr){
       // int n = arr.length;
        int MaxSum =  Integer.MIN_VALUE;
        int currSum = 0;
        //this will only work if the array contains only +ve elements 
        // for (int i = 0; i < n; i++) {
        //     currSum += arr[i];
        //     MaxSum = Math.max(MaxSum , currSum);
        // }
        

        // this brute force approach will work
        for (int i = 0; i < arr.length; i++) {  // select the starting point of sub array
            for (int j = i; j < arr.length; j++) { // select the ending point of a subarray
                     currSum= 0;
                for (int k = i; k <= j; k++) { // calculate the sum of the sub array 
                currSum += arr[k];
                    MaxSum = Math.max(MaxSum, currSum);

                }
            }
        }
        return MaxSum;

    }
    public static int betterApproach(int[] arr){
         int MaxSum =  Integer.MIN_VALUE;
        int currSum = 0;
        // this better approach   will work by adding new element to the everytime 
        for (int i = 0; i < arr.length; i++) { 
                currSum= 0;          // select the starting point of sub array
            for (int j = i; j < arr.length; j++) { // select the ending point of a subarray
                     
                 // calculate the sum of the sub array 
                currSum += arr[j];
                    MaxSum = Math.max(MaxSum, currSum);
            }
        }
        return MaxSum;
    }
    public static int KadanesAlgorithm(int [] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
     
            max = Math.max(max, sum);

            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
         
        int [] arr = {2, 3, 5, -2, 7, -4};
        int[] nums = {-2, -3, -7, -2, -10, -4};
        System.out.println(MaxSum(nums));
        System.out.println(betterApproach(arr));
        System.out.println(MaxSum(arr));
        System.out.println(KadanesAlgorithm(nums));
    }
}
