import java.util.*;

public class Q3 {
    public static List<Integer> solve(int[] arr){
        List<Integer> res= new ArrayList<>();
        
        List<Integer> six =  new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        List<Integer> three = new ArrayList<>();
        List<Integer> other = new ArrayList<>();
        
        for (int i : arr) {
            if(i % 6 == 0) six.add(i);
            else if(i%2 == 0 && i%3!=0)two.add(i);
            else if(i % 3 == 0 && i%2!= 0) three.add(i);
            
            else other.add(i);

        }
        res.addAll(six);
        res.addAll(two);
        res.addAll(three);
        res.addAll(other);


        
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =  sc.nextInt();
        while (n-- > 0) {
            int arrlen =  sc.nextInt();
            int arr[] = new int[arrlen];
            for (int i = 0; i < arrlen; i++) {
                arr[i] = sc.nextInt();
            }
            List<Integer> res = solve(arr);
            for (int i : res) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
