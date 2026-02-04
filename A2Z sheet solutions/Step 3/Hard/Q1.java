import java.util.ArrayList;
import java.util.List;

public class Q1{
    public static void printarr(int[] arr){
        for (int i : arr) {
            System.out.print(i+", ");
        }
    }
    // extreme brute force approach here 
                                    // isme n -1 and r - 1 value pass karni hai tabhi sahi answer ayega 
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i < n; i++){
          //  ans.add( printingNthRow(i+1));
          ans.add(printNthRowBetter(i));
        }
        return ans;
    }
     public static int pascalsValue(int n , int r){
        int res = 1;
        for (int i = 0; i < r ; i++) { 
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    public static List<Integer> printingNthRow(int n){
        List<Integer> ans= new ArrayList<>();

        for (int i = 0; i < n; i++) {
           ans.add( pascalsValue(n - 1,(i + 1 ) - 1));
        }
        return ans;
    }

    // better approach
    public static List<Integer> printNthRowBetter(int n){
        List<Integer> ans =  new ArrayList<>();
        int res = 1;
        ans.add(res);
        for (int i = 1; i < n; i++) {
            res = res *(n - i);
            res = res / i;
            ans.add(res);
        }
        return ans;

    }
    public static void main(String[] args) {
      
     System.out.println(generate(5)); // extreme brute force soln Tc O(n^3)


    
    }
}