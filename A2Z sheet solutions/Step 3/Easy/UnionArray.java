import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnionArray {
    public static List<Integer> solution1(int []arr1, int[] arr2){
         HashSet<Integer> set = new HashSet<>();
         List<Integer> union = new ArrayList<>();
         for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
         }
          for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
         }
         union.addAll(set);

         printArr(union.stream().mapToInt(Integer::intValue).toArray());
         return union;
    }
    public static void printArr(int[]arr){
        for (int i : arr) {
             System.out.print(i +" ");
        }
       
    }
    public static void main(String[] args) {
        int[] arr    = {3,1,31,4,5,6};
        int[] arr2   = {1,2,3,4,5,6};
        solution1(arr, arr2);
    }
}
