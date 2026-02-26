

public class Q8 {     
    public void merge(long[] num1, long [] num2){
        long[] arr = new long[num1.length + num2.length];
        int left = 0;
        int right = 0;
        int index = 0;
        while(left < num1.length && right < num2.length){
            if(num1[left] <= num2[right]){
                arr[index] = num1[left];
                index++;
                left++;
            }
            else {
                arr[index] = num2[right];
                index++;
                right++;

            }
        }
        while(left < num1.length){
            arr[index++] = num1[left++];
        }
        while(right < num2.length){
            arr[index++] = num2[right++];
        }


        
         for (int i = 0; i < arr.length; i++) {
            if(i < num1.length) num1[i] = arr[i];
            else  num2[i - num1.length] = arr[i];
         }
    }
    /**
     * Merge two sorted arrays where {@code num1} has enough space at the end
     * to hold all elements of {@code num2}. The first {@code m} elements of
     * {@code num1} are the valid sorted numbers, and {@code n} is the length of
     * {@code num2}. The result is stored in {@code num1}.
     */
    public static void mergeoptimal(int[] num1 , int m, int[] num2, int n){
        // pointers for valid parts of each array
        int i = m - 1;            // last index of valid elements in num1
        int j = n - 1;            // last index in num2
        int k = m + n - 1;        // last index of merged array in num1

        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            } else {
                num1[k--] = num2[j--];
            }
        }

        // copy leftover elements from num2 if any
        while (j >= 0) {
            num1[k--] = num2[j--];
        }
    }    
    public static void main(String[] args) {
        // example with extra space in num1
        int [] num1 = new int[6];
        num1[0] = -5;
        num1[1] = -2;
        num1[2] = 4;
        num1[3] = 5;
        int m = 4;               // number of valid elements in num1

        int [] nums2 = {-3, 1, 8};
        int n = nums2.length;

        mergeoptimal(num1, m, nums2, n);

        // print merged result
        for (int val : num1) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
