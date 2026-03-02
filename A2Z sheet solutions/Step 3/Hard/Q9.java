import java.util.Arrays;

public class Q9{
    //this approach is invalid cause we cannot modify the array but we can create a copy and then modify it which will work but will not be so optimal
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
    public static int[] verynaive(int[] arr){
        int missing = -1;
        int repeating = -1;
        int n  = arr.length;
        for (int i = 1; i <= arr.length; i++) {
            int count  = 0;
            for (int j = 0; j < arr.length; j++) {
                if( arr[j]== i){
                    count++;
                }
            }
                if(count == 2){
                    repeating = i;
                }
                else if(count == 0){
                    missing =  i;
                }

            if(missing != -1 && repeating != -1){
                break;
            }
            
            
        }
        int[] ans = {repeating,missing};
        for (int i : ans) {
            System.out.print(i+" ");
        }
        
        return ans;
    }
    public static int[] optimalAprroach(int[] arr){
        int n  = arr.length;
        long s = 0, s2= 0;
        long SN = (n * (n + 1))/2;
        long S2N = (n * (n + 1) * (2*n+ 1))/6;
        for(int i = 0; i < n; i++){
            s += arr[i];
            s2 +=  (long)arr[i] *(long) arr[i];
        }
        long val1 = s - SN; 
        long val2 = s2 - S2N;
        val2 = val2 / val1;
        long x = (val1 + val2) /2;
        long y =  x - val1;
        int[] ans =  {(int) x, (int)y};
        for (int j : ans) {
        System.out.print(j+" ");
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 7, 5, 7};  //{1,2,3,5,6,7,7}
                                            //{1,2,3,4,5,6,7}
        mythinking(arr);
        System.out.println();
        verynaive(arr);
        System.out.println();
        optimalAprroach(arr);

    }
}