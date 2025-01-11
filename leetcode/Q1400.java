public class Q1400 {
    
    public boolean canConstruct(String s , int k ){
             int n = s.length();
               if (n< k ){
                   return false ;
     
                }
                if(n == k ){
                   return true;
                }
             int[] odd = new  int[26];
                for(char c : s.toCharArray()) {
                      odd[c - 'a']++;

                }
                  int oddfreq = 0;
                 for(int i = 0 ; i< 26; i++){
                     if (odd[i]%2 != 0) {
                               oddfreq++;
                       }
                    }
         return oddfreq <=k;
    }
     
}
