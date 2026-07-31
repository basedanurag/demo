import java.util.Stack;

public class Q2 {
    // mono tonic stack problem 
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans  =  new int[n];
        Stack<Integer> st  = new Stack<>();
        for(int i =  2*n - 1 ; i >= 0 ; i--){
            while(!st.isEmpty() && st.peek() <= nums[i % n]){
                st.pop();
            }
            // yha pe i % n islie nahi kara kyuki i < n 
            if(i < n){
             ans[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(nums[i % n ]);
        }
        
        return ans;
    }
}
