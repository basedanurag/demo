import java.util.Arrays;

public class Q2206 {
    /*class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int x : nums) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        
        for (int count : mp.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }
        
        return true;
    }
}
class Solution {
    public boolean divideArray(int[] nums) {
       boolean[] paired =  new boolean[501];
       Arrays.fill(paired, true);

       for(int num : nums){
        paired[num] = !paired[num];
       } 
       for(int i =0; i <501; i++) {
        if(!paired[i]){
            return false;
        }
       }
       return true;

    } 
} */
/*class Solution {
     public boolean divideArray(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num : nums) {
            if(st.contains(num)){
                st.remove(num);
            } else {
                st.add(num);
            }
        }
        return st.isEmpty();
    }
}*/
class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i+=2) {
            if((nums[i] ^ nums[i-1]) !=0){
                return false; 
            }
        }
        return true;
    }
}
}
