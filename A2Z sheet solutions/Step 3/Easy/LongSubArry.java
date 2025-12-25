public class LongSubArry {
    public static int approach1(int[] arr,int k){
        int n = arr.length;
        int res= 0;
        for(int i = 0; i <n; i++){
            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];

                if(sum == k) res = Math.max(res, j - i + 1);
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        
    }
}
