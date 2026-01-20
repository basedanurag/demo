import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q3 {
    public static int MajorityElementBrute(int[] arr){
      //  int count = 0;
        int result =0;
        for (int i = 0; i < arr.length; i++) {
          int  count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > arr.length/2){
                result =  arr[i];
            }
        }
        return result ;
    }
    public static int MajorityElementBetter(int[] arr){
        // remember ths for next time frequency queestion it is necessary
        HashMap<Integer,Integer> hmp  = new HashMap<>();
        for (int i : arr) {
            hmp.put(i, hmp.getOrDefault(i,0)+ 1);
        }

        for(Map.Entry<Integer, Integer> entry : hmp.entrySet()){
            if(entry.getValue() > arr.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
    // Moores voting algorithms
    public static int MajorityElementOptimal(int[] arr){
        int element = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(count == 0){
                element = arr[i];
                count+=1;
            }
            else if( arr[i]== element){
                count++;
            }else {
                count--;
            }
        }
        int count1 =0;
        for (int i = 0; i < arr.length; i++) {
            if(element == arr[i]){
                count1++;
            }
            if(count1 > (arr.length /2)){
                return element;
            }
        }
        
        
        return -1;
    }
    public static void main(String[] args) {
                int[] arr = {2, 1, 1, 1, 1, 2, 2,3,3,3,3,3,3,3,3,3};
               System.out.println("Answer is "+ MajorityElementBrute(arr));
               System.out.println("the ans is "+ MajorityElementBetter(arr));
               //moore voting algorithm
               System.out.println("the soln of most optimal solution is " + MajorityElementOptimal(arr));

    }
}
