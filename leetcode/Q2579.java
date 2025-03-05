public class Q2579 {
    /*class Solution {
    public long coloredCells(int n) {
        int t =1;
        long cells = 1;
        while(t<=n) {
            cells +=  (4L * (t-1)); 
            t++;
        }
        return cells;
    }
} */
class Solution {
    public long coloredCells(int n) {
        return 1 + (2L * (long)(n - 1) * n);
    }
}
}
