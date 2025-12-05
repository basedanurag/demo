public class FindMissingNumber {
    // brute force  approach for finding the missing number inside an array 
    public static int MissingNumber1(int[] arr) {
        int num = 1;
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                num++;
            } else {
                result = num;
            }

        }

        return result;
    }
    //optimized approach 1 for finding the missing number inside an array 
    public static int MissingNumber2(int[] arr) {
        int result = -1;
        int sum1 = 0;
        int n = arr[arr.length - 1];
        int sum = 0;
        // sum of number 1 to n
        for (int i = 0; i <= n; i++) {
            sum1 += i;
        }
        // sum of whole array
        for (int i : arr) {
            sum += i;
        }

        result = sum - sum1;
        return result;

    }

    //optimized approach 2 for finding the missing number inside an array 
    public static int MissingNumber3(int[]arr){
        int result = -1;
        int  n  =  arr[arr.length - 1];
        int xor1 =0,xor2 =0;
        for (int i = 0; i < arr.length; i++) {
                xor1 ^= arr[i];
                xor2 ^= (i+ 1); 
        }
        xor2 ^= n;
        result = xor1 ^ xor2;

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        System.out.println("the missing number is:-" + MissingNumber3(arr));

    }
}
