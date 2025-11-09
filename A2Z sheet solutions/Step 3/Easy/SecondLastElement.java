public class SecondLastElement {
    public static int secondMaxElement(int[] arr){
        int Max = arr[0];
        int prevMax = arr[0];
        if(arr.length < 2) return -1;

        for(int i = 0;  i < arr.length; i++){
            
            if(arr[i] > Max){
                prevMax = Max;
                Max = arr[i];
            }
            else if(arr[i] > prevMax && arr[i] != Max){
                prevMax = arr[i];
            }

        }
        
        return prevMax;
    }
    public static void main(String[] args) {
         int[] arr = {3,1,31,4,5,6};
        System.out.println("Using the recuursive method to find the second largest  element which is  "+secondMaxElement(arr));

    }
}
