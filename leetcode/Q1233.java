import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1233 {
    class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        result.add(folder[0]); // the first folder can newver be the sub folder 

        for(int i = 1; i < folder.length; i++){
            String currFolder = folder[i];
            String lastFolder = result.get(result.size() - 1);
            lastFolder += "/";

            if(!currFolder.startsWith(lastFolder)){
                result.add(currFolder);
            }
        }
        return result;
    }
}
}
