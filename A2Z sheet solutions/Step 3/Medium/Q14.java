import java.util.HashMap;

public class Q14 {
    public static int bruteforce(int[]arr, int n){
        int  count =0; //TC O(n^3)
        for(int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }


                if(sum == n){
                    count++;
                }
            
            }
        }
        return count;
    }
    public static int betterapproach(int[]arr, int k){
        int count= 0;
        int sum  = 0;
        for (int i = 0; i < arr.length; i++) {
            sum =0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if(sum == k)count++;
            }
        }
        
        return count;
    }
    public static int optimal(int[]arr, int k){
         int n = arr.length;

        // Map to store frequency of prefix sums
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        // Initialize prefix sum and count of subarrays
        int prefixSum = 0;
        int count = 0;

        // Base case: prefix sum 0 has occurred once
        prefixSumCount.put(0, 1);

        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Add current element to prefix sum
            prefixSum += arr[i];

            // Calculate the prefix sum that needs to be removed
            int remove = prefixSum - k;

            // If this prefix sum has been seen before,
            // add its count to the result
            if (prefixSumCount.containsKey(remove)) {
                count += prefixSumCount.get(remove);
            }

            
            // Update the frequency of the current prefix sum
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
       System.out.println( bruteforce(arr, 6));
       System.out.println(betterapproach(arr, 6));
       System.out.println(optimal(arr, 3));
    }
}