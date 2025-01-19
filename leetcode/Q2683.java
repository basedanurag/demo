public class Q2683 {
    
    public boolean doesValidArrayExist(int[] der) {
     int sum =0;
     
         for(int num : der){
            sum += num;
         }
     return sum % 2 ==0;
     

    
    }
    
}
