import java.util.Arrays;


public class Q6 {
    public static int daysNeeded(int capacity , int weights[]){
        int day = 1;// sara maal ek din me load hogya
        int currLoad = 0;

        for (int i : weights) {
            if(currLoad + i > capacity){
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
    public static int optimal(int[] weights, int days){
        int low  =  Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int ans  = high;
        while(low <= high){
            int mid  =  low + (high - low)/2;
            int neededDays = daysNeeded(mid, weights);

            if(neededDays > days ){
                low = mid + 1;
            }
            else{
                ans  = Math.min(ans,mid);
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       
        int[] weights = {1,2,3,4,5};
        System.out.println(bruteforce(weights, 2));
        System.out.println(optimal(weights, 2));
    }
}
