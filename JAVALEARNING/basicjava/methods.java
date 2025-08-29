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
 static void  update(int A[]){
    A[0] = 25;
   
    
 }
    public static void main(String[] args) {
       // int num1 = 15;
       // int num2 = 50;
       int [] A = new int[5];
        
        //boolean res  = isPrime(num);
         update(A);
        System.out.println(A[0] +" ");
       
    }
}
