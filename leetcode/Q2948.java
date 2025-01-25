import java.lang.Math;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Q2948 {
    /*  brute force 
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        for(int i =0; i<n ; i++) {
            while(true){
                int smallValue = nums[i];
                int idx =-1;
                for(int j =i+1; j<n;j++){
                    if(Math.abs(nums[i] - nums[j] <= limit)){
                        if (nums[j] < smallValue ){
                           smallValue = nums[j];
                           idx =j;

                        }

                    }

                }   
                if (idx != -1) {
                    //swap the values
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;

                }   else {
                    break;
                }           
            }
           
        }
        return nums; 

    }
    */
    //optimal Solution
    //this question is done because of brute force thinking

    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] vec = nums.clone();
        Arrays.sort(vec);

        int groupNum = 0;
        Map<Integer, Integer> numToGroup = new HashMap<>();
        Map<Integer, LinkedList<Integer>> groupToList = new HashMap<>();

        numToGroup.put(vec[0], groupNum);
        groupToList.putIfAbsent(groupNum, new LinkedList<>());
        groupToList.get(groupNum).add(vec[0]);

        for (int i = 1; i < n; i++) {
            if (Math.abs(vec[i] - vec[i - 1]) > limit) {
                groupNum++;
            }
            numToGroup.put(vec[i], groupNum);
            groupToList.putIfAbsent(groupNum, new LinkedList<>());
            groupToList.get(groupNum).add(vec[i]);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int group = numToGroup.get(num);
            result[i] = groupToList.get(group).pollFirst(); // Use and remove the smallest element
        }

        return result;
    }
}
