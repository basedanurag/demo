import java.util.Arrays;

public class Q757 {
    class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        int n =  intervals.length;
        Arrays.sort(intervals,(v1,v2)-> {
            if(v1[1]!=v2[1])
                return v1[1] - v2[1];
            return v2[0]-v1[0];
        });

        int res = 0;
        int first = -1;
        int second = -1;

        for(int i = 0;i< n; i++){
            int l = intervals[i][0];
            int r = intervals[i][1];

            if(l <= first)
            continue;

            if(l > second){
                res+= 2;
                second = r;
                first = r - 1;
            }
            else{
                res += 1;
                first  = second;
                second = r; 
                
            }

        }
    return res;
    }
}
}
