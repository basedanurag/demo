import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2 {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 1; i* i <= n; i++){
            if(n % i == 0){
                ans.add(i);
            
                if(i != n/i){
                    
                ans.add(n /i);
                
                }
            
            }
            
        }
        Collections.sort(ans);
        
        return ans;
    }
   
    public static void main(String[] args) {
        
    }
}
