public class Q2138 {
    class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n  =  s.length();
        int groups = (n + k -1) / k;
        String[] result  = new String[groups];
        for(int i = 0; i < groups; i++){
            StringBuilder group =  new StringBuilder();
            for(int j = 0; j < k; j++){
                int idx =  i * k + j;
                if(idx < n) {
                    group.append(s.charAt(idx));

                }else {
                    group.append(fill);

                }
            }
            result[i] = group.toString();

        }
        return result;
    }
}
}
