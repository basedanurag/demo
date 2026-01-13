import java.util.HashMap;

public class Getminoneocc {
    public static int approach1(int[] arr){
        //TC: O(N^2)
        for(int i = 0; i < arr.length;i++){
            int num =  arr[i];
            int count =  0;
            for(int j = 0; j < arr.length ; j++){
                if(arr[j] == num){
                    count++;
                }
            }
            if(count ==1) return num;

        }
        
        
        return -1;

    }
    public static int approach2(int [] arr){
        //Hashing method TC:O(N)
        //Sc :  O(N)
        //get the max element from array then create a freq array and then store the freq of the array in to freq array
        HashMap<Integer,Integer> mp  = new HashMap<>();


        //method to count frequency of a number from a array
        for (int i : arr) {
            mp.put(i, mp.getOrDefault(i,0) + 1);       
        }
        
        for (int num : arr) {
            if(mp.get(num)== 1){
                return num;
            }
        }
        return -1;
    }
    public static int approach3(int[] arr){
        int result = 0;
        for (int i : arr) {
            result ^= i;
        }
        return result;
    }
    public static void main(String[] args) {
int[] arr ={7, 3, 3, 4, 4, 5, 5};
       System.out.println( approach3(arr));
        
       System.out.println( approach2(arr));
       
       System.out.println( approach1(arr));

    }
}
