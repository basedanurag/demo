public class MoveZeroToEnd {
    public static void bruteforce(int[]arr){
        int n = arr.length;
        int[] temp = new int[n];
        int idx = 0;
        //maintaining the array
        //TC :- O(n) and SC :- O(n) for extra array
        for(int i = 0; i< n; i++){
            if (arr[i] != 0){
                temp[idx] =  arr[i];
                idx++;
            }
        } // copying back too og array 
        for(int i = 0; i <n; i++){
            arr[i] = temp[i];
        }
        printArr(arr);
    }
    public static void printArr(int []arr){
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
    public static void optimalapproach(int []arr){
        int j  = -1;
        //iska role bas pehla zero finding tha
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0 ){
               j = i;
               break;
            }
        }
        for (int i = j + 1; i < arr.length; i++) {
            if(arr[i] != 0){
                swap(arr, i, j);
                j++;
            }
        }
        printArr(arr);
    }
    public static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,5,6};
        // bruteforce(arr);
        optimalapproach(arr);
    }

}
