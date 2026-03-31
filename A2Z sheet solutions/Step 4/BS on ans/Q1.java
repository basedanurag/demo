public class Q1{
    public static int bruteforce(int num) {
        
        for (int i = 1; i < num; i++) {
            int root  = 0;
             root = i * i;
            if(num == 1){
                return num;
            }
            if(root == num){
                return i;
            }
            if(root > num){
                return i - 1;
            }
            
        }
        return 0;
    }   
    public static int optimal(int num){
        int ans =  1;
        int low  =  1;
        int high =  num;
        while(low <= high){
            int mid  =  (low + high)/2;

            if((mid * mid) > num){
                high = mid - 1;
            }
            else{
                low =  mid + 1;
                ans  = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(bruteforce(26));
        System.out.println("hello world");
        System.out.println(optimal(49));
    }
}