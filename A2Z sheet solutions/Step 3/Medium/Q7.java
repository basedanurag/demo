import java.util.ArrayList;

public class Q7 {
      public static void printArray(int arr[]){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
     public static int[] rearrangeArray(int[] nums) {
       ArrayList<Integer> posarr = new ArrayList<>();
        ArrayList<Integer> negarr = new ArrayList<>();

         for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                posarr.add(nums[i]);
            }
            else{
                negarr.add(nums[i]);
            }
        }
        int p =0; 
        int n = 0; 

        for(int i = 0; i < nums.length; i++){
            if (i % 2 == 0){
                nums[i] = posarr.get(p++);
            }else{
                nums[i] = negarr.get(n++);
            }
        }
        printArray(nums);

        return nums;
    }
    public static int[] optimalSol(int[] arr){
        int n = arr.length;
        int[] ans  = new int[n];
        int posidx = 0;
        int negidx = 1;
        for (int i = 0; i < ans.length; i++) {
            if(arr[i] > 0){
                ans[posidx] = arr[i];
                posidx+= 2;
            }
            else{
                ans[negidx] = arr[i];
                negidx +=2;
            }
        }
        printArray(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5};

        System.out.println(rearrangeArray(arr));
        System.out.println(optimalSol(arr));
    }
}
