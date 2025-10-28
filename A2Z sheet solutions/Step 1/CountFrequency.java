import java.util.Scanner;
import java.util.*;


public class CountFrequency {

    public static void main(String[] args) throws Exception{
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
        System.out.println("Fetching process starts here ");
        System.out.println("enter number of query");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("enter number to fetch detail");
            int number = sc.nextInt();
            if(map.containsKey(number)) 
            System.out.println( "the frequency of "+number+"is "+map.get(number));

        }
        sc.close();
    }
}