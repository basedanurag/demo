public class Q12 {
    public static int bruteForce(int[] arr){
        int res = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = i; j < arr.length; j++) {
                prod *= arr[j];
                res = Math.max(res, prod);
            }
        }
        return res;
    }
    public static int betterApproach(int[] arr){
        int maxi = arr[0];
        int prefix = 1;
        int suffix = 1;
        for (int i = 0; i < arr.length; i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= arr[i];
            suffix *= arr[arr.length - i - 1];
            maxi = Math.max(maxi, Math.max(prefix, suffix));

        }
        return maxi;
    }
    public static int maxProduct(int[] nums) {
        int res = nums[0];
        int maxProd = nums[0];
        int minProd = nums[0];

        // Traverse from second element
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            // Swap if current is negative
            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Update max and min product
            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);

            // Update result
            res = Math.max(res, maxProd);
        }

        return res;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,-3,0,-4,-5};
       
        System.out.println("Output for brute approach " + bruteForce(arr));
        System.out.println("Output for optimal approach "+betterApproach(arr));
        System.out.println("Output for optimal approach  slightly modified kadanes algorithm" + maxProduct(arr));

    }
}
