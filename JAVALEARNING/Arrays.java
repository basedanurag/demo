
public class Arrays {
    public static void main(String[] args) {
        int []  arr = { 1,2,3,4,5,16};
        int [] newArr = new  int[10];
        // Copy arr into newArr (first arr.length elements)
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        //int search = 5;
       //maxElement(arr);
        ///  foreach(arr);
        //search(arr,search);
        //secondMax(arr);
        //rightRotate(arr);
        //delete(newArr,  2); // Example: insert 99 at index 6
        //copy(arr);  
        reverse(arr);
   
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
    static void foreach(int[] arr){
        for(int i = 0; i < arr.length; i++ ){
            System.out.println(arr[i]++);
        }
        System.out.println(" // 2nd array ");
        for(int  c : arr){
            System.out.println(  c++);
        }
    }
    static void search(int[] arr, int search){
       
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == search){
                System.out.println("found it at " + i);
                System.exit(0);
            } 
        }
      
                  System.out.println("not found");
            

      
       
    }
    static void secondMax(int[] arr){
    int max1 = arr[0];
    int max2 = arr[0];
    for(int i  = 0; i < arr.length; i++){
        if(arr[i] > max1){
            max2 = max1; // Update second max before changing max1
            max1 = arr[i];
           
        } else if(arr[i] > max2){
            max2 = arr[i];
        }
    }
     System.out.println(max2);
           if(max2 == max1){
               System.out.println("No second max found, all elements are equal.");
           } else {
               System.out.println("Second maximum element is: " + max2);
           }
}
    static void leftRotate(int[] arr){
        // left rotations
        int temp = arr[0];

        for(int x : arr){
            //array before rotation
            System.out.println( "array befre rotations " + x);
        }
        for(int i  = 0; i < arr.length - 1; i++){
        
            arr[i] = arr[i+1];
          
        }
          arr[arr.length - 1] = temp;

        for (int c : arr){
            // array after rotations
            System.out.println("arr after rotation"); 
            System.out.print( c);
        }
    }
    static void rightRotate(int[] arr){
         int temp = arr[arr.length - 1];
         System.out.println("arr before rotation");
        for(int x : arr){
            //array before rotation
            
            System.out.print(x + "");
            System.out.print("");
        }
        for(int i  = arr.length - 1; i > 0 ; i--){
          arr[i] = arr[i - 1];
        }
          arr[0] = temp;

     System.out.println("arr after rotation");
        for(int x : arr){
            //array after rotation
            
            System.out.print(x + "");
            System.out.print("");
        }
     }
    static void insert(int[] arr, int value, int index){
        // Insert value at index, shifting elements to the right
        if(index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return;
        }
        for(int i = arr.length - 1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        System.out.print("Array after insertion: ");
        for(int x : arr) System.out.print(x + " ");
        System.out.println();
    }
    static void delete(int[] arr, int index){
        if(index <0 || index > arr.length ){
            System.out.println("Invelid index");
        return;
        }
        for(int i = index; i < arr.length - 1; i++){
            arr[i] = arr[ i + 1];
        }

        System.out.println("arr agter deletion");  

         for(int x : arr) System.out.print(x + " ");
        System.out.println();
    }
    static void  copy(int[] arr){
        int [] newArre = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArre[i] = arr[i];
        
        }
        for(int c : arr){
            System.out.print(c +",");
            System.out.print("");
        }
    }
    static void reverse(int[] arr){
        int[] rev =  new int[arr.length];
        for(int i = arr.length - 1,j =0; i >= 0; i--,j++){
              rev[j] =  arr[i];
                        
        } //Before rev
          for(int c : arr){
            System.out.print(c +",");
            System.out.print("");
        }
        System.out.println("after reverse");
          for(int c : rev){
            System.out.print(c +",");
            System.out.print("");
        }
    }
}


