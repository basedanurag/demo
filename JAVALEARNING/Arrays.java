public class Arrays {
    public static void main(String[] args) {
        int []  arr = { 2,5,3,2,1,4,5};
       maxElement(arr);
        
    }
    static void maxElement(int[] arr){
        int maxel = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        for(int i : arr){
           maxel= Math.max(maxel ,i );
           System.out.println("Current element: " + i + ", Max so far: " + maxel);
        }
    }
    static void sum(int[] arr){
        int sum  = 0; 
        for(int x : arr){
            sum += x;

        }
        System.out.println("Sum of array elements: " + sum);
    }
}
