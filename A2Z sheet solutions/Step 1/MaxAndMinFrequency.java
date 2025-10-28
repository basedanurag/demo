
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxAndMinFrequency {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("pre Computing of array has started"+"\npre cpmputing completed");
        // pre computing of the arrray 
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
             System.out.println("enter "+i+"th number");
            arr[i] = sc.nextInt();
            int key = arr[i];
            int freq =0;
            if(map.containsKey(key)) freq = map.get(key);
            freq++;

           map.put(key,freq);
        }
        int maxElement = 0, minElement = 0;
        int maxfreq = 0, minFreq = n;

        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
           int count =  mp.getKey();
           int element = mp.getValue();
           if(count > maxfreq){
            maxfreq = count;
            maxElement = element;
           }
           if(count < minFreq){
            minElement = element;
            minFreq = count;
           }

        } 

        System.out.println("Fetching process starts here ");
        System.out.println("THE MAX FREQUENCY OF NUM IS " + maxElement);
        System.out.println("the min freq of Num is "+ minElement);
    

        sc.close();
    }
}
