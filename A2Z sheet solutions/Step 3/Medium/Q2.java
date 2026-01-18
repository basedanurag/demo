public class Q2 {
    public static void printArray(int arr[]){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void SortingBrute(int arr[]){
        int count0 = 0 ,count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== 0){
                count0++;
            }
            else if(arr[i] == 1){
                count1++;
            }else{
                count2++;
            }
        }
        for(int i = 0;  i < count0; i++){
            arr[i] = 0;
        }
        for(int i = count0; i < count0 + count1; i++){
            arr[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
            arr[i] = 2;
        }

        printArray(arr);

        
    }
    public static void main(String[] args) {
        int  arr[] = {0,1,0,1,0,1,1,2,0,0,0,0,2,2,2};
        SortingBrute(arr);
    }
}
