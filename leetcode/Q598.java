public class Q598 {
    public int maxcount(int m ,int n ,int[][] ops ){
        int mina=m,minb=n;

        for(int[] op : ops) {
            mina= Math.min(mina, op[0]);
            minb = Math.min(minb, op[1]);
        
        }
        return mina*minb;
        
    }
}
