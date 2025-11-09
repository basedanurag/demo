import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static int  bruteFore(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>(); // this take SC :- O(n)
        //inserting the arrays element into the Set TC : O(nlogn)
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        //modifying array after insertion Tc : - O(n)
        int index =0;
        for (Integer it : set) {
            arr[index] = it;
            index++;
        }   
        return index;
    }
    public static int optimal(int[]arr){
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i+ 1;
    }
    public static void main(String[] args) {
            int[] arr = {3,1,31,4,5,6,7,7,7,7,7,7,7,7};
            Arrays.sort(arr);
            int newLen = bruteFore(arr);
            for (int i = 0; i < newLen; i++) {
                System.out.print(arr[i]+" ");
            }
            
            
    }
}
