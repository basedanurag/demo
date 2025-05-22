public class Pattern {
    public static void main(String[] args){
        int cnt =0;
        for(int i  = 5; i >=1; i--){
            for(int j  = 1; j<= i; j++){
             ++cnt;
                System.out.print(j+ " " );
               
            } 
          
            System.out.println("");
        }
    }
}
