public class Q10{
    public static int bruteFprce(int[] arr){ // brute force was very easy TC O(N2)
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(i < j && arr[i] > arr[j]) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {5,3,2,1,4};
        System.out.println(bruteFprce(arr));
        
    }
}