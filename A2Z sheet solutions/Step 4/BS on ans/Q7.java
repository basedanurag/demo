

public class Q7 {
    public static int bruteForce(int[] vec, int k){
        for (int i = 0; i < vec.length; i++) {
            if(vec[i] <= k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
  
    public static void main(String[] args) {
        int vec[]={4,7,9,10};
        System.out.println(bruteForce(vec, 4));
    }
}
