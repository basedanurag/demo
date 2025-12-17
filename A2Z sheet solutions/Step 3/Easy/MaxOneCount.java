public class MaxOneCount {
    public static int counter(int [] arr){
        int count = 0;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            maxi = Math.max(maxi,count);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] var1 = new int[]{0, 1, 1, 1, 1, 1};
       System.out.println( counter(var1));
    }
}
