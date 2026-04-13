import java.util.Arrays;


public class Q6 {
    public static int daysNeeded(int capacity , int weights[]){
        int day = 1;// sara maal ek din me load hogya
        int currLoad = 0;

        for (int i : weights) {
            if(currLoad + weights[i] > capacity){
                day++;
                currLoad =i;

            }else{
                currLoad += i;
            }
        }
        return day;
    }
    public static int bruteforce(int weights[], int days){
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
      
        for (int i = left; i<= right ; i++) {
           int needed = daysNeeded(i, weights);
            if(needed <= days ) return i;
        }
        return right;
    }
    public static void main(String[] args) {
       
        int[] weights = {1,2,3,4,5};
        System.out.println(bruteforce(weights, 2));
    }
}
