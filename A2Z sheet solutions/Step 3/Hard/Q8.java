import java.util.Arrays;

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
    public static void mergeoptimal(long[] num1 , long[] num2){
        int left = num1.length - 1;
        int right =  0;
        long temp = 0;
        while(left >= 0 && right < num2.length){
             if(num1[left] > num2[right]) {
                temp  = num1[left];
                num1[left] =  num2[right];
                num2[right] = temp;
                left++;
                right--;
             }
             else{
                 break;

             }

             Arrays.sort(num1);
             Arrays.sort(num2);
        }
    }
    public static void main(String[] args) {
        
    }
}
