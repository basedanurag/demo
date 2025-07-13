public class methods {
    static boolean isPrime(int num){
       
       for(int i = 2; i < num /2; i++){
            if(num % i == 0){
               return false;
            }
        } 
        return true;
      
    }
    static int GCD(int num1,int num2){
       while(num1 != num2){
         if(num1 > num2){
            num1 -= num2;
           }
           else if(num2>num1){
            num2 -=  num1;
           }
       }
        return num1;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 50;
        
        //boolean res  = isPrime(num);
      int n =  GCD(num1, num2);
        System.out.println(n+" ");
    }
}
