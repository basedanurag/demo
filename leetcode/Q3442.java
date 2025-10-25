public class Q3442 {
    class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        int[] mp = new int[26];
        int odd  = 0;
        int even = n;
        for(char c : s.toCharArray()){
            mp[c - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(mp[i] % 2 != 0)
            odd = Math.max(odd,mp[i]);

            if(mp[i] % 2 ==  0 && mp[i] > 0)
            even = Math.min(even, mp[i]);
        }

        return odd - even;
    }
}
}
