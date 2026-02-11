import java.util.*;

public class Q5 {
    public static int bruteForce(int a[]){
// core logic holder
    // compute length of the longest subarray with sum 0
        // store best length found so far
        int maxLen = 0;
        // map prefix sum -> first index seen
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        // running prefix sum
        int sum = 0;

        // iterate through the array
        for (int i = 0; i < a.length; i++) {
            // update running sum
            sum += a[i];

            // if sum is zero, subarray [0..i] has zero sum
            if (sum == 0) {
                // update best length
                maxLen = i + 1;
            }
            // if this sum seen before, subarray (prevIndex..i] has zero sum
            else if (sumIndexMap.containsKey(sum)) {
                // maximize length using previous index
                maxLen = Math.max(maxLen, i - sumIndexMap.get(sum));
            }
            // first time seeing this sum, store its index
            else {
                sumIndexMap.put(sum, i);
            }
        }

        // return best length
        return maxLen;
    }

    public static int optimalApproach(int[] arr) {
        int n = arr.length;
        int maxi = 0;
        int sum = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum == 0) {
                maxi = i + 1;
            }

            if (hmap.containsKey(sum)) {
                maxi = Math.max(maxi, i - hmap.get(sum));
            } else {
                hmap.put(sum, i);
            }
        }
        return maxi;

    }

    public static void main(String[] args) {
        int array[] = { 6, -2, 2, -8, 1, 7, 4, -10 };

        System.out.println(optimalApproach(array));
        System.out.println(bruteForce(array));

    }
}
