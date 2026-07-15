import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        int subset = (1 << nums.length);
        for(int i = 0; i < subset; i++){
            List<Integer> ans  =  new ArrayList<>();
            for(int j  = 0; j < nums.length; j++){
                if((i & (1<<j))!=0){
                    ans.add(nums[j]);
                }

            }
            subsets.add(new ArrayList<>(ans));
        }
        return subsets;
    }
}
