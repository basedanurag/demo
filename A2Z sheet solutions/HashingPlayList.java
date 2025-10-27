import java.util.Scanner;

public class HashingPlayList {
    /* array hashing
    // public static void main(String[] args) {
    //     // hasing for number array or we can say Integer array 
    //     // java doesnt have any limit on array like c++
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Array length");
    //     int n  = sc.nextInt();
    //     int arr[] = new int[n];
    //     System.out.println("enter the array elements ");
    //     for(int i =0; i < arr.length; i++){
    //         System.out.println("enter the "+i+"th number");
            
    //         arr[i]= sc.nextInt();
            
    //     }
    //     System.out.println("\nthe array is ");
    //     //foreach loop to print the arr
    //     for(int x : arr)
    //     System.out.print(x +" ");

    //     //precomputation of array
    //     int hash[]= new int[n];
        
    //     for(int i = 0; i < n; i++){
    //         hash[arr[i]] +=1;
    //     }

    //     // fetching 
    //     System.out.println("\nenter number of query to fetch");
    //     int q = sc.nextInt();
    //     while(q-- >0){
    //         System.out.println("\nenter number to fetch");
    //         int number = sc.nextInt();
    //         System.out.print("the freQuency of the "+number+ " is :-");
    //         System.out.println(hash[number]);
    //     }
    //     sc.close();
    // }
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // character hashing 
        //  AS it uses ascii values we can use several methods to count the frequenecy 
        //1st is if the string has only lower case ex = a,b,c,d....z use hash[s.charAt(i)] = ch - 'a';
        //2nd if the string has only upper case ex =A,B,C,D...Z use hash[s.charA(i)]= ch - 'A';
        //3rd if it contains all of them then just like array use hash od size 256 in others use 26 and count like this hash[s.charAt(i)]++;

        String string = "adjwdijdadasdasdadad";

        //pre  computing
        System.out.println("pre computing starts...");
        int hash[]= new int[26];
        for (int i = 0; i < hash.length; i++) {
             for(char s: string.toCharArray() ){
            hash[string.charAt(i)] = s - 'a'; 
        }
        System.out.println("fetching start here ");
        int query = sc.nextInt();
            while(query-- !=0){
            
        //fetching
            for(int i = 0; i < hash.length; i++ ){
            System.out.println(hash[string.charAt(i)]);
        }
        }
        }
       sc.close();
    }
}
