public class Q2125 {
    class Solution {
    public int numberOfBeams(String[] bank) {
        
     int n  =  bank.length;
     int result = 0;
     int prevCount = 0;
     for(int i = 0; i < n; i++){
        int curr = 0;
        for(char c : bank[i].toCharArray()){
            if(c == '1')
            curr++;
        }

        result += (prevCount * curr);

        
        prevCount =  (curr==0)? prevCount : curr;
     } 
     return result;  
    }
}
}
