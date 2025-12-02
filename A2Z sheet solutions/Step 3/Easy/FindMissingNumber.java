public class FindMissingNumber {
    public static int MissingNumber1(int[] arr){
        int num = 1;
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                num++;
            }
            else{
                result = num;
            }

        }

        return result;
    }
    public static int MissingNumber2(int[]arr){
        int result = -1;
        int sum = 0;
        int count= 0;
        for (int i : arr) {
            sum+=i;
        }
        

        return result;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println("the missing number is:-"+MissingNumber1(arr));

    }
}
