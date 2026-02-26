

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
    public static void mergeoptimal(int[] num1 , int[] num2){
        // i: last valid index in nums1
        int m =  num1.length;
        int n =  num2.length;
        int i = m - 1;

        // j: last index in nums2
        int j = n - 1;

        // k: last index in nums1 including extra 0s
        int k = m + n - 1;

        // Fill nums1 from the back
        while (i >= 0 && j >= 0) {
            // Place larger element from end of nums1 or nums2
            if (num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            } else {
                num1[k--] = num2[j--];
            }
        }

        // If nums2 has leftovers, copy them to nums1
        while (j >= 0) {
            num1[k--] = num2[j--];
        }

        // Remaining nums1 elements are already in correct position
    }    
    public static void main(String[] args) {
        int [] num1 = {-5, -2, 4, 5, 0, 0 };


        int []nums2 = {-3, 1, 8} ;

        mergeoptimal(num1,nums2);
    }
}
