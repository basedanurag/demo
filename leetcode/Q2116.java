public class Q2116 {
   
        public boolean canBeValid(String s, String locked) {
            int n = s.length();
            if (n% 2!=0){
            return false ;
            }
    
            int count = 0;
            for( int i = 0; i<n ; i++){
                if (locked.charAt(i)== '0' || s.charAt(i) == '(')
                    count ++;
                
                else 
                count --;
                if (count < 0)
                    return false ;
            } count = 0;
                for(int i = n-1 ; i>=0 ; i--){
                    if (locked.charAt(i)=='0' || s.charAt(i)== ')')
                        count++;
                    else 
                    count --;
                    if (count<0)
                    return false;
    
                }
            
            return true ;
    
        }
    
}
