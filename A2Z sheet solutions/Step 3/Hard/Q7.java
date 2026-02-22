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
     public List<List<Integer>> merge(int[][] intervals) {
        // Sort intervals based on start time
        Arrays.sort(
            intervals,
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // List to store merged intervals
        List<List<Integer>> merged = new ArrayList<>();

        // Traverse through all intervals
        for (int[] interval : intervals) {
            // If merged list is empty or no overlap
            if (
                merged.isEmpty() ||
                merged.get(merged.size() - 1).get(1) < interval[0]
            ) {
                // Add current interval as a new block
                merged.add(
                    Arrays.asList(interval[0], interval[1])
                );
            } else {
                // Overlapping: update end to max of both
                int last = merged.size() - 1;
                int maxEnd = Math.max(
                    merged.get(last).get(1),
                    interval[1]
                );
                merged.get(last).set(1, maxEnd);
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        int ans[][] = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(bruteForce(ans));
    }
}
