public class Q10{
    public static int bruteFprce(int[] arr){ // brute force was very easy TC O(N2)
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(i < j && arr[i] > arr[j]) count++;
            }
        }
        return count;
    }
    public static int merge(int[] arr, int low , int mid , int high){
    
       int[] temp = new int[high - low + 1];
       int left  = low;
       int right  =  mid + 1;
       int count  = 0;
       int k = 0;

       while(left <= mid && right <= high ){
        if(arr[left] <= arr[right]){
            temp[k++] =  arr[left++];
        }
        else{
            temp[k++] = arr[right++];
            count += (mid - left + 1);
        }
       }
       while(left <= mid){
        temp[k++]= arr[left++];
       }
       while(right <= high){
        temp[k++] = arr[right++];
       }
       for (int i = low; i <=  high; i++) {
        arr[i] = temp[i - low];
       }
       return count;
    }
    public static int megersort(int [] arr, int low, int high){
        int count = 0;
        if(low>= high) return count;

        int mid  = (low + high)/2;
        count+= megersort(arr, low, mid);
        count+=megersort(arr, mid+ 1, high);
        count+= merge(arr, low, mid, high);

        
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {5,3,2,1,4};
        System.out.println(bruteFprce(arr));
        System.out.println(megersort(arr, 0, arr.length - 1));
        
    }
}