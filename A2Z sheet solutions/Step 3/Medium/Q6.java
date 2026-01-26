import java.io.*;

// public class Q6 {
//     public static int bruteforce(int[] arr){
//         int sum = 0;
//         int max = 0; // cause selling on higher and buying on lower always give the +ve result
//         for(int i = 0 ; i < arr.length; i++){

//             for (int j = i+1; j < arr.length; j++) {
//                 if(arr[i] < arr[j]){
//                 sum = arr[j] - arr[i];
//                 max = Math.max(max, sum);
//                 }

//             }
            
//         }
//         return max;
//     }
//     public static void main(String[] args) throws Exception {
//           FileInputStream fis = new FileInputStream("input.txt");
//         System.setIn(fis);

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         sc.close();
      
//         System.out.println(bruteforce(arr));
//     }
// }


public class Q6 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("input.txt")
        );

        String line = br.readLine(); // entire test case
        String[] parts = line.split(",");

        int n = parts.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.println("Input size = " + n);

        
      //  System.out.println(solve(arr));
         System.out.println(optimalDP(arr));
         br.close();
    }

    static int solve(int[] arr) {
        int sum = 0;
        int max = 0; // cause selling on higher and buying on lower always give the +ve result
        for(int i = 0 ; i < arr.length; i++){

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                sum = arr[j] - arr[i];
                max = Math.max(max, sum);
                }

            }
            
        }
        return max;
    }
    static int optimalDP(int[]arr){
        int cost =0;
        int min =  arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            cost = arr[i] - min;
            profit = Math.max(profit,cost);


            // for tracing the minimum element i will track using mini and arr[i]
            min = Math.min(min, arr[i]);

        }
        return profit;
    }
}

