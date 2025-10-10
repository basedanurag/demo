public class Q3147 {
    class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n =  energy.length;
        int[] t = new int[n];

        for(int  i = n - 1; i >= 0; i-- ){
            if(i + k < n)
            t[i] = energy[i] + t[i + k];
            else
            t[i] = energy[i];
        }
        int maxEnergy = t[0];
        for(int i  = 1; i < n; i++){
            maxEnergy = Math.max(maxEnergy, t[i]);
        }
        return maxEnergy;
    }
}
}
