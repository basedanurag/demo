public class Q1{
    public static int minBitFlips(int start, int goal) {
        int i = 0;
        int count = 0;
        int ans  =  start^goal;
        while(i < 31){
            if((ans & (1<<i)) != 0){
                count++;
            } 
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        int start =  10;
        int goal = 7;
        int ans  =  minBitFlips(start, goal);
        System.out.println(ans);
    }
}