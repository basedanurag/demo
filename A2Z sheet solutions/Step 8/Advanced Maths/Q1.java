import java.util.ArrayList;

public class Q1{
    public static ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 2; i <=  Math.sqrt(n); i++){
            if(n % i == 0){
                
               // add here for distinct prime numbers      
                while(n %i == 0){
                  ans.add(i);
                  // add here for all prime numbers factors 
                    n = n /i;
                }
            }
        }
        
        if(n != 1) ans.add(n);
        return ans;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans = primeFactors(18);
        for (Integer integer : ans) {
            System.out.print("["+integer+ "]");
        }
    }
}