import java.util.*;

public class Q4 {
    public static int count(int[] array, int sum, int index, int k) {
        // base case
        int counter = 0;
       
        if (index == array.length) {
            if (sum == k) {
                return 1;
            }
            return counter;
        }
       
        

        // take
        counter += count(array, sum + array[index], index + 1, k);
        // not take 
        counter += count(array, sum, index + 1, k);

        return counter;       
    }

    public static void main(String[] args) {
        int arr[] = { 4, 9, 2, 5, 1 };
        int k = 10;
        System.out.println(count(arr, 0, 0, 10));
    }
}
