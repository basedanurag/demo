import java.util.Stack;

public class Q5 {
    final int Mod =  1000000000+7;
    public int[] findNSE(int[] arr){
        int n  =  arr.length;
        // next smaller element using monotonic stack\
        int[] ans = new int[n];
        Stack<Integer> st   = new Stack<>();

        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : n;

            st.push(i);
        }
        return ans;
    }
    public int[] findPSEE(int[] arr){
        int n  = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st   = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            ans[i] =  !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        long total = 0;
        int[] nse  = findNSE(arr);
        int[] pse =  findPSEE(arr);

        for(int i = 0; i < arr.length; i++){
            int left  =  i -  pse[i];
            int right =  nse[i] -  i;

            long freq = left * right * 1L;

            // Contribution = frequency * value
            int val = (int)((freq * arr[i]) % Mod);

            // Add contribution to sum
            total = (total + val) % Mod;
        }
        return (int)total;
    }
}
