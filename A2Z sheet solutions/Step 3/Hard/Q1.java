public class Q1{
    public static void printarr(int[] arr){
        for (int i : arr) {
            System.out.print(i+", ");
        }
    }
    // extreme brute force approach here 
                                    // isme n -1 and r - 1 value pass karni hai tabhi sahi answer ayega 
    public static int pascalsValue(int n , int r){
        int res = 1;
        for (int i = 0; i < r ; i++) { 
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    public static void printingNthRow(int n){
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i]  = pascalsValue(n - 1,(i + 1 ) - 1);
        }
        printarr(arr);

    }
    public static void main(String[] args) {
                                        //example hai ye extreme brute force ka 
        System.out.println(pascalsValue(5- 1,  3 - 1));
        printingNthRow(5);
    }
}