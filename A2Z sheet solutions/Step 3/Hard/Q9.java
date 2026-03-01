import java.util.Arrays;

public class Q9{
    public static int[] mythinking(int[]arr){
        int first = 0;
        int last = first + 1;
        Arrays.sort(arr); 
        int [] ans = new int[2];
        while(last < arr.length){
            if(arr[first] == arr[last]){
                ans[0] = arr[first];
            }
            if(arr[last] - arr[first] > 1){
                ans[1] = arr[first] + 1;
            }
            first++;
            last++;
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 7, 5, 7}; // {1,2,3,5,6,7,7}
        mythinking(arr);
    }
}