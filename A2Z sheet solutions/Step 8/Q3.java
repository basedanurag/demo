public class Q3 {
    public static int  setIthBit(int num , int i){
      num =  num | (1<<i); 

      return num; 
    }
    public static boolean checkIthBit(int num, int i){
        System.out.println(num + " "+ i);
        if((num & (1<<i)) != 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num =  9;
        int i = 2;
        
        System.out.println(checkIthBit(num, i));
        System.out.println(setIthBit(num, i));
        num = setIthBit(num, i);
         System.out.println(checkIthBit(num, i));
    }
}
