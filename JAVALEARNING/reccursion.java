public class reccursion {
    // when output first
   static  void fun(int n){
    if(n >0){
        System.out.print(n);
        fun(n - 1);
    }
    
} 
    //recursion 1st
     static  void fun2(int n){
        if(n >0){
        
        fun2(n - 1);
        System.out.print(n);
    }
}
    public static void main(String args[]){
        int n = 3;
        fun(n);
         System.out.println(" ");
        fun2(n);
        


    }
   
}
