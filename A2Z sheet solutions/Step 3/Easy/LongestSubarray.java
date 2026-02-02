import java.util.HashMap;

public class LongestSubarray {
    public static int subArrayOptimal(int[] arr, int n){
        // this will use the 2 pointer approach or we can say sliding window approach hai
        int left  =  0;
        int right = left;
        int len  = 0;
        int sum = 0;
        while( right < arr.length){
            sum += arr[right];
            
            while(sum >= n){
                if(sum == n ){
                len  =  Math.max(len, right - left + 1);
                }
                sum -= arr[left];
                left++;
            }
            right++;
        }
         return len;
    }
    public static int subArrayBetter(int[] arr, int n){ 
        // prefix sum 
       HashMap< Integer, Integer> presum =  new HashMap<>();
       int sum = 0;
       int len = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; //      {1,2,1,1,5,6};

            //case 1 when full subarray from 0 to i has  sum = k
            if(sum == n){
                len  = Math.max(len, i + 1);
            }
            // case 2 if(sum - k) was seen before
            int res =  sum - n;
            if(presum.containsKey(res)){
                int l =  i - presum.get(res); //length of pre sum 
                len  = Math.max(len, l);
            }
            // store the 1st occurance of sum 
            if(!presum.containsKey(sum)){
                presum.put(sum, i);
            }
        }
        
        System.out.println("the length is "+ len);
    return len;
         
    }
    public static int subArray(int[] arr, int n){
        // brute force it is 
        int len = 0;
        // for i pointer 
        for(int i= 0; i < arr.length; i++){
            // for j pointer 
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                //ye lopp check karega for in range btw i to j 
                for (int k = i; k <= j; k++) {
                    sum += arr[k];          
                }
                if(sum  == n ){
                        len  = Math.max(len, j - i + 1);
                    }
            }
        }
        System.out.println("the longest subarray length is "+ len );
        return len;
    }

    public static void main(String[] args) {
         int[] arr = {1,2,1,1,5,6};
         subArray(arr, 3); 
         subArrayBetter(arr, 3); // works on negative integers 
    }
}
