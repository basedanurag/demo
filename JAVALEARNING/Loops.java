public class Loops {
    public static void main(String[] args) {
    
   /*int n  = 10;
    // int num  =  1;
    int sum  = 0;
    for(int i  = 1; i<= n ; i++){
      sum += i;
      //System.out.println("sum is : " + sum);
      //   System.out.println(num+ " *" +i+"= " +(num * i))
    }
    //System.out.println("sum is : " + sum);
      
      */
      // factorial of a number
     int num = 5;
     int fact = 1;
     for(int i = 1; i <= num; i++){
            fact *= i;
     }
     System.out.println("factorial of " + num + " is : " + fact);
    }
}
