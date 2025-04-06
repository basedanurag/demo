import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q368 {
    class Solution {
        public List<Integer> largestDivisibleSubset(int[] nums) {
            // sort the array for checking the last idx of array
            Arrays.sort(nums);
            
            int n = nums.length;
            int[] sublen = new int[n];
            Arrays.fill(sublen,1);
            int[] prevIdx = new int[n];
            Arrays.fill(prevIdx , -1);
            
            int lastChosenIndex = 0;
    
            int maxLength = 1;
            for(int i = 0; i< n; i++){
                for(int j = 0; j< i ; j++){
                    if(nums[i]%nums[j]==0){
                        if(sublen[i]<sublen[j]+1){
                            sublen[i] = sublen[j] +1;
                            prevIdx[i] = j;
                        }
                        if(sublen[i]>maxLength){
                            maxLength = sublen[i];
                            lastChosenIndex = i;
    
                        }
                    }
                }
            }
            List<Integer> result = new ArrayList<>();
            while(lastChosenIndex >=0){
                result.add(nums[lastChosenIndex]);
                lastChosenIndex = prevIdx[lastChosenIndex];
            }
            return result;
    
        }
    }
}
