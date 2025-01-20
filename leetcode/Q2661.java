import java.util.HashMap;
import java.util.Map;

public class Q2661 {
        public int firstCompleteIndex(int[] arr, int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            
    
            Map< Integer , Integer > mp = new HashMap<>();
            for(int i =0; i< arr.length ; i++){
                mp.put(arr[i],i);
            }
            int minIndex = Integer.MAX_VALUE;
            
            //CHECK each row one by one 
            
            for(int row = 0; row<m ; row++){
                int lastIndex = Integer.MIN_VALUE; // last index when this row will be completely painted 
                for(int col = 0 ; col<n ; col++){
                    int value = mat[row] [col];
                    int idx = mp.get(value);
                    lastIndex = Math.max(lastIndex, idx);
    
                }
                minIndex = Math.min(minIndex, lastIndex);
    
    
            }
            // check for each column one by one 
            for(int col = 0; col < n ; col++){
    
                int lastIndex = Integer.MIN_VALUE; // last index when this col will be completely painted 
                
                for(int row  = 0 ; row < m ; row++){
                    int value = mat[row] [col];
                    int idx = mp.get(value);
                    lastIndex = Math.max(lastIndex, idx);
    
                }
                
                minIndex =  Math.min(minIndex, lastIndex);
    
            }
            return minIndex;
        }
}
