import java.util.HashMap;
import java.util.Scanner;

public class HashingPlayList {
    /*
     * array hashing
     * // public static void main(String[] args) {
     * // // hasing for number array or we can say Integer array
     * // // java doesnt have any limit on array like c++
     * // Scanner sc = new Scanner(System.in);
     * // System.out.println("Array length");
     * // int n = sc.nextInt();
     * // int arr[] = new int[n];
     * // System.out.println("enter the array elements ");
     * // for(int i =0; i < arr.length; i++){
     * // System.out.println("enter the "+i+"th number");
     * 
     * // arr[i]= sc.nextInt();
     * 
     * // }
     * // System.out.println("\nthe array is ");
     * // //foreach loop to print the arr
     * // for(int x : arr)
     * // System.out.print(x +" ");
     * 
     * // //precomputation of array
     * // int hash[]= new int[n];
     * 
     * // for(int i = 0; i < n; i++){
     * // hash[arr[i]] +=1;
     * // }
     * 
     * // // fetching
     * // System.out.println("\nenter number of query to fetch");
     * // int q = sc.nextInt();
     * // while(q-- >0){
     * // System.out.println("\nenter number to fetch");
     * // int number = sc.nextInt();
     * // System.out.print("the freQuency of the "+number+ " is :-");
     * // System.out.println(hash[number]);
     * // }
     * // sc.close();
     * // }
     */
    /*Character Hashing 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // character hashing
        // AS it uses ascii values we can use several methods to count the frequenecy
        // 1st is if the string has only lower case ex = a,b,c,d....z use
        // hash[s.charAt(i)] = ch - 'a';
        // 2nd if the string has only upper case ex =A,B,C,D...Z use hash[s.charA(i)]=
        // ch - 'A';
        // 3rd if it contains all of them then just like array use hash od size 256 in
        // others use 26 and count like this hash[s.charAt(i)]++;

        String s = "adjwdijdadasdasdadad";

        // pre computing
        System.out.println("pre computing starts...");
        int hash[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;  
        }
        System.out.println("fetching start here ");

        System.out.println("enter how many query you want");
        int query = sc.nextInt();
        while (query-- > 0) {
            System.out.println("enter character to find freq");
            char c= sc.next().charAt(0);
            // fetching

            System.out.println("The Frequency of "+ c+ " is :- "+hash[c - 'a']);

            
        }

        sc.close();
    }
        */

    //Hashing using HashMap 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arr length");
        
        int n  = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the value for "+i+"ith Index");
            arr[i] = sc.nextInt();
        }

        // in this we will use HashMap to store frequency as Key Value pair

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int Key = arr[i];
            int freq = 0;
            if(map.containsKey(Key)) freq = map.get(Key);
            freq++;
            map.put(Key,freq);
        }
        System.out.println("enter number of q");
        int q = sc.nextInt();
        
        while (q-- >0) {
            int number;
            System.out.println("enter number to find the frequency");
            number = sc.nextInt();
            if(map.containsKey(number))
            System.out.println("the frequency is "+ map.get(number));
            else
            System.out.println(0);
            
        }
        sc.close();



    }

}

