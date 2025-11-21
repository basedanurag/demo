import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UnionArray {
    public static void solution1(int[]arr1,int[]arr2){
        HashMap<Integer,Integer> mp = new HashMap<>();
        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            mp.put(arr1[i], mp.getOrDefault(arr1[i], 0) + 1);

        }
        for (int i = 0; i < arr2.length; i++) {
            mp.put(arr2[i],mp.getOrDefault(arr2[i], 0) + 1 );

        }
        for (int itr : mp.keySet()) {
            union.add(itr);
        }
        printArr(union.stream().mapToInt(Integer::intValue).toArray());

    }
    public static List<Integer> solution2(int []arr1, int[] arr2){
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
    public static List<Integer> solution3(int[] arr1, int [] arr2){
        List<Integer> union = new ArrayList<>();
        int m  = arr1.length;
        int n  = arr2.length;
        int i = 0;
        int j = 0;
        while (i<m && j < n ) {
            if (arr1[i] <= arr2[j]){ //case 1 and case 2
                if(union.size()==0 || union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                 
                }
                i++;
            }
            else{ // case 3 where arr1[i] > arr2[j];
                    if(union.size()==0 || union.get(union.size() - 1) != arr2[j]){
                    union.add(arr2[j]);
                    }
                j++;
                }
        }
            
        
        while (i <  m) {
            if ( union.get(union.size()- 1) != arr1[i]) {
                union.add(arr1[i]);              
            } 
            i++;
        }
        while (j < n) {
            if ( union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }


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
        //solution1(arr, arr2);
        solution3(arr, arr2);
    }
}
