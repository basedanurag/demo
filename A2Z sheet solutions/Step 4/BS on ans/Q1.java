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
       int ans =  0;
        int low  =  1;
        int high =  num/2;
        if(num == 0) return 0;
        if (num == 1) return 1;
        while(low <= high){
            int mid  = low +( high - low )/2;
            long sqr = (long) mid * mid;
            if(sqr <= num){
                low = (int) mid + 1;
                ans = (int) mid;
            }
            else{
               high = (int) mid - 1;
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