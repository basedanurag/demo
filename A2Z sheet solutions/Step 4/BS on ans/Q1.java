public class Q1{
    public static int bruteforce(int num) {
        
        for (int i = 0; i < num; i++) {
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
        
    }
    public static void main(String[] args) {
        System.out.println(bruteforce(16));
        System.out.println("hello world");
    }
}