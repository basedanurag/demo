import java.util.HashMap;
import java.util.Map;

public class Q3160 {
    
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
// we are using map because while using the array the question gets MLE so map is better 
        Map<Integer,Integer> colormp = new HashMap<>(); 
        Map<Integer,Integer> ballmp = new HashMap<>(); 
        for (int i = 0 ; i < n ; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];
            if(ballmp.containsKey(ball)) {
                int prevColor = ballmp.get(ball);
                colormp.put(prevColor , colormp.get(prevColor) -1 );
                

                if(colormp.get(prevColor)==0){
                    colormp.remove(prevColor);
                }
            }
            ballmp.put(ball, color);
            colormp.put(color, colormp.getOrDefault(color, 0) +1);
            
            result[i] = colormp.size(); 
        }
        return result;
    }
}


