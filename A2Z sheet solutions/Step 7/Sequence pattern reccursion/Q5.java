public class Q5 {
    public static boolean count(int[] array, int sum, int index, int k) {
        // base case
        if (index == array.length) {
            if (sum == k) {
                return true;
            }
            return true;
        }

        // take
        if (count(array, sum + array[index], index + 1, k))
            return true;
        // not take
        if (count(array, sum, index + 1, k))
            return true;

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 8;
        System.out.println(count(arr, 0, 0, 10));
    }
}
