import java.util.Arrays;
import java.util.Stack;


   

public class Q1 {
     public int[] nextGreaterElementMono(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[10001];
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            nextGreater[nums2[i]] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreater[nums1[i]];
        }

        return nums1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans [] = new int[nums1.length];
        Arrays.fill(ans, -1);
        for(int i = 0; i < nums1.length ; i++){
            for(int j  = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    for(int k  = j + 1; k < nums2.length; k++){
                        if(nums2[k] > nums2[j]){
                                ans[i] =  nums2[k];
                                break;
                        }
                        
                    }
                  
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
