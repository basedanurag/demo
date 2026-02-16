import java.util.*;

public class Q7 {
    public static List<List<Integer>> bruteForce(int[][] intervals){
        int i = 0;
        int n =  intervals.length;
        int m = intervals[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        while (i < n) {
            int start = intervals[i][0];
            int end  =  intervals[i][1];    
            int j  =  i + 1;
            while(j < n && intervals[j][0] <= end){
                end = Math.max(end, intervals[j][1]);
                j++;
            }
            ans.add(Arrays.asList(start, end));
            i  = j;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans[][] = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(bruteForce(ans));
    }
}
