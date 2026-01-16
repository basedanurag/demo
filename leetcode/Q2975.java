import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q2975 {
    class Solution {
    private static final int M = 1_000_000_007;
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {        
        int len  =  0;
        List<Integer> hList = new ArrayList<>();
        List<Integer> vList = new ArrayList<>();

        for(int x : hFences) hList.add(x);
        for(int x : vFences) vList.add(x);
        hList.add(1);
        hList.add(m);
        vList.add(1);
        vList.add(n);

        Collections.sort(hList);
        Collections.sort(vList);

        Set<Integer> widths = new HashSet<>();


        // for  widths
        for(int i = 0; i < vList.size() ; i++){
            for(int j  =  i + 1; j < vList.size(); j++){
                widths.add(vList.get(j) - vList.get(i));

            }
        }
        // for heights
        for(int i = 0; i< hList.size() ; i++){
            for(int j  =  i + 1; j < hList.size(); j++){
                int height   = hList.get(j) - hList.get(i);
                if(widths.contains(height)){
                    len = Math.max(len, height);
                }

            }
        }

        if(len == 0)
         return -1;

     long area = (long) len * len;
        return (int) (area % M);
    }
}
}
