import java.util.*;

public class Q2 {
    public static List<Integer> freq(int[] arr){
        Map<Integer, Integer> hmp = new HashMap<>();
        List<Integer> ans  = new ArrayList<>();
        for(int i : arr){
            hmp.put(i, hmp.getOrDefault(i,0)+ 1);
        }
        for(Map.Entry<Integer,Integer> entry : hmp.entrySet()){
            if(entry.getValue() > arr.length/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
