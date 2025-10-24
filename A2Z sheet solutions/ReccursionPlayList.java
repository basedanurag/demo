import java.util.*;


public class ReccursionPlayList {
    // reccusrive method for printing name n times 
    public static void printName(int n){
        if(n == 0)
        return ;
        System.out.println("Anurag");
        printName(n - 1);
    }

    //recursive method for printing 1 -> n linearly
    public static void pintNumber1(int i, int n){
        if(i > n)
        return;
        System.out.print(i +" "); 
        pintNumber1(i + 1, n);
    }

     //recursive method for printing N -> 1 linearly
    public static void pintNumber2(int i){
        if(i < 1)
        return;
        System.out.print(i +" "); 
        pintNumber2(i - 1);
    }

    //recursive method for printing N -> 1 linearly using BackTracking
    public static void pintNumber3(int i, int n){
        if(i > n)
        return;
        
        pintNumber3(i + 1,n);

        System.out.print(i+" ");
    }
    //sum of N numbers using recursion
    public static void Sum(int i, int sum){
       
        if (i < 1){
        System.out.print(sum);

        return;
        }
        Sum(i - 1, sum + i); 
    }
    // factorial number using recursion
    public static int factorial(int n){
        
        if (n == 1 || n == 0){
            return 1;
        }
         return n * factorial(n - 1);
    }
    //method for swaping
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Reverse an array using recursion( two pointer)
    public static void ReverseArray(int[] arr, int start, int end){
        if(start>=end)
        return;
        swap( arr,start, end);
        ReverseArray(arr, start + 1, end - 1);
       
    }//method for printing an array
    public static void printArr(int[] arr){
         for(int x: arr){
            System.out.print(x+ " ");
        }
    }
    public static boolean palindromeString(int i , String s){
        if (i > s.length()/2) return true;
        if (s.charAt(i) != s.charAt(s.length()- i - 1)) return false;

        return palindromeString(i+ 1, s);


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hello");
        int  n;
        String s;
        System.out.println("enter n"); 
        n = sc.nextInt();
        System.out.println("enter the string");
        s = sc.next();
        System.out.println("\noutput for printing name N times");
        printName(n);

        System.out.println("\noutput for printing 1 -> N (linearly) using reccursion");
        pintNumber1(1, n);
    
        System.out.println("\noutput for printing N -> 1 (linearly) using reccursion");
        pintNumber2(n);

        System.out.println("\noutput for printing N -> 1 (linearly) using reccursion backtracking");
        pintNumber3(1,n);

        System.out.println("\noutput fot Sum of N number");
        Sum(n, 0);
        
        System.out.println("\noutput fot Factorial of N number");
        System.out.println(factorial(n));

        //reversing array question
        int arr[] = { 5, 4, 3, 2, 1};
        System.out.println("\nArray before reversal");
        printArr(arr);
        ReverseArray(arr, 0, arr.length- 1);
        System.out.println("\nthe reverse array is ");
        printArr(arr);

        System.out.println("\nchecking weather a string is palindrome or not");
        
        System.out.println(palindromeString(0, s));


        sc.close();

    }
}
