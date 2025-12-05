public class FindMissingNumber {
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

    public static int MissingNumber2(int[] arr) {
        int result = -1;
        int sum1 = 0;
        int n = arr[arr.length - 1];
        int sum = 0;
        // sum of number 1 - n
        for (int i = 0; i < n; i++) {
            sum1 += i;
        }
        // sum of whole array
        for (int i : arr) {
            sum += i;
        }

        result = sum - sum1;
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        System.out.println("the missing number is:-" + MissingNumber2(arr));

    }
}
