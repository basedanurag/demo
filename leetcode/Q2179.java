public class Q2179 {
    class Fenwick {
        public long[] tree;
        Fenwick(int n ) {
            tree = new long[n+1];
        }
        public void update(int k, int x ) {
            k++;
            while(k<tree.length){
                tree[k]+= x;
                k+= k & -k;
            }
        }
        public long query(int k) {
            long total = 0;
            k++;
            while(k>0) {
                total += tree[k];
                k -= k & - k;
            }
            return total;
        }
    }
    class Solution {
        public long goodTriplets(int[] nums1, int[] nums2) {
            int n = nums1.length;
            long total =0;
            int[] mpp = new int[n];
            for(int i = 0; i < n; i++) mpp[nums1[i]] = i;
            Fenwick fw = new Fenwick(n);
            for(int i : nums2){
                int index = mpp[i];
                long left = fw.query(index);
                long total_  = fw.query(n-1);
                long right = (n-1-index) -  (total_ -  left);
                total += left* right;
                fw.update(index,1);
            }
            return total;
        }
    }
}
