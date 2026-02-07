import java.util.*;

public class Q3 {
    public static List<List<Integer>> bruteforce(int[] arr){
       // List<List<Integer>> res  = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        if(n < 3){
            return new ArrayList<>(set);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int j2 = j + 1; j2 < arr.length; j2++) { 
                    if (arr[i] + arr[j] + arr[j2] == 0){
                        List<Integer> ans= Arrays.asList(arr[i],arr[j],arr[j2]);
                        Collections.sort(ans);
                        set.add(ans);
                        
                    }
                    
                }
                
            }
            
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
                    // 0,1,2,3, 4 ,5
        System.out.println(bruteforce(arr));
    }
}
