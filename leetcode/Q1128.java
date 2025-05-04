public class Q1128 {
    class Solution {
        public int numEquivDominoPairs(int[][] dominoes) {
            int[] mp = new int[100];
            for(int[] d : dominoes)
                if(d[0]>d[1]) mp[d[0] * 10 + d[1]]++;
                else mp[d[1]*10 + d[0]]++;
            
            int count = 0;
            for(int freq : mp)
            // combination formulla
            count += (freq -1) * freq / 2;
    
    
            return count;
    
        }
    }
}
