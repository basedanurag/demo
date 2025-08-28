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
    /* int num = 5;
     int fact = 1;
     for(int i = 1; i <= num; i++){
            fact *= i;
     }
     System.out.println("factorial of " + num + " is : " + fact);
     */
    // how to print a number in armstrong number or not
    // 153 = 1^3 + 5^3 + 3^3
 /*  int sum = 0;
    int num  = 153;
    int rem = 0;
    int m = num;
    while(num> 0){
      rem = num % 10;
     
      sum += rem * rem *rem;
        num  = num / 10;
     
    }
    if(sum == m){
  System.out.println("num is :armstrong number");
}else{  
  System.out.println("num is :not an armstrong number");
}*/
/*//reversing a number
int num2 = 146741;
int m = num2;
int rev = 0;
int rem2 = 0;
while(num2 > 0){
   rem2 = num2 % 10;
  rev = rev * 10 + rem2;
  num2 = num2 / 10;
  
    }
    if(rev == m){
  System.out.println("num is :palindrome number");
    System.out.println("reverse of number is : " + rev);
}
else{
  System.out.println("num is :not a palindrome number");
  System.out.println("reverse of number is : " + rev);
}*/

/*//how to print a number in words
  String num  = "";
  int num3= 1700;
  int rem3 = 0;
  while(num3 > 0){
     rem3 = num3 % 10;
    num3 = num3 / 10;
    num = num + rem3;

  }
  for(int i = num.length() - 1; i >= 0; i--){
    char ch = num.charAt(i);
    switch(ch){
      case '0':
        System.out.print("zero ");
        break;
      case '1':
        System.out.print("one ");
        break;
      case '2':
        System.out.print("two ");
        break;
      case '3':
        System.out.print("three ");
        break;
      case '4':
        System.out.print("four ");
        break;
      case '5':
        System.out.print("five ");
        break;
      case '6':
        System.out.print("six ");
        break;
      case '7':
        System.out.print("seven ");
        break;
      case '8':
        System.out.print("eight ");
        break;
      case '9':
        System.out.print("nine ");
        break;
    }
  }
*/
/*//printing the ap series
int a = 2;
int d  = 5;
int n  = 5;
for(int i  = 1; i <= n; i++){
  int ap = a + (i-1)*d;
  System.out.print(ap + " ");
  
}
*/
/*//printing the gp series
int n = 5;
int a = 2;
int r = 3;
for(int i  = 1; i <=n; i++){
  int gp = a *(int) Math.pow(r,i-1);
  System.out.print(gp + " ");  
}
*/
//printing the fibonacci series
 int n = 100;
 int a  = 0;
 int b  = 1;
 int c  = 0;
 System.out.print(a+ "," + b + ",");
 while(c< n){
  
  c = a+ b;
  a = b;
  b =c;
  System.out.print(c + ",");

 }

 }
}
