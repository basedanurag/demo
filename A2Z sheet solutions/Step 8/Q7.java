public class Q7 {
    public static boolean checkIthBit(int num , int i){
        if((num & (1 <<i)) != 0) return true;
        return false;
    }
    // remove the last set bit
    public static int countSet(int num){
    
        int i =  0;
        int count = 0;
        while (i < 10) {
            if(checkIthBit(num, i)){
                count++;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n  =  13;
        System.out.println(countSet(n));
    }
}
