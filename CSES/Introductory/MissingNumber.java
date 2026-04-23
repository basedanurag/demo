// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
import java.util.*;

public class MissingNumber {


    public static long missing(long n , long[] arr){
            long presentSum = 0;
            for (long x : arr) presentSum += x;

            return (long) n * (n + 1) / 2 - presentSum;
    
        }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        long n = sc.nextInt();
        long[] arr = new long[(int)n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.println(missing(n, arr));
        sc.close();
    }
    // public static void main(String[] args) throws Exception {

    //     // Input file (change path if needed)
    //     BufferedReader br = new BufferedReader(new FileReader("input.txt"));

    //     long n = Long.parseLong(br.readLine().trim());

    //     long[] arr = new long[(int) n - 1];

    //     String[] parts = br.readLine().trim().split(" ");
    //     for (int i = 0; i < n - 1; i++) {
    //         arr[i] = Long.parseLong(parts[i]);
    //     }

    //     br.close();

    //     long result = missing(n, arr);

    //     // Output to console
    //     System.out.println(result);

    //     // Optional: write output to file
    //     BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
    //     bw.write(String.valueOf(result));
    //     bw.close();
    // }

}
