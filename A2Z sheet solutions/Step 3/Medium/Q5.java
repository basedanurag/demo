public class Q5 {
     public static int KadanesAlgorithm(int [] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int ansstart = -1;
        int ansend = -1;

        for (int i = 0; i < arr.length; i++) {
            if(sum == 0) start =i;

            sum += arr[i];

            if(sum > max){
            max = Math.max(max, sum);
            ansstart = start ;
             ansend = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        System.out.print("[");
        for(int i = ansstart; i <= ansend; i++){
            System.out.print(""+arr[i] +", ");
        }
        System.out.println("]");


        return max;
    }
    public static void main(String[] args) {
         int [] arr = {2, 3, 5, -2, 7, -4};
        int[] nums = {-2, -3, -7, -2, -10, -4};
        // System.out.println(MaxSum(nums));
        // System.out.println(betterApproach(arr));
        System.out.println(KadanesAlgorithm(arr));
        System.out.println();
        System.out.println(KadanesAlgorithm(nums));
        
    }
}
