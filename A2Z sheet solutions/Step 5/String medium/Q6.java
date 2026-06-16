public class Q6 {
    // ye basic iteration se solve hua hai isko agar dp laga de to ye O(n2) me solve ho jayega 
    public static boolean isPalindrome(String s , int start, int end){
        if(start >= end) return true;

        if(s.charAt(start) == s.charAt(end)){
            return isPalindrome(s, start + 1, end - 1);
        }
       
        return false;
    }
    public static String solve(String s){
        int maxLength = Integer.MIN_VALUE;
        int startPoint = -1;
       
        
        for(int i = 0; i < s.length() ; i++){
            for(int right  = i; right < s.length(); right++){
                if(isPalindrome(s, i, right)){
                    if((right - i +1) >= maxLength){
                    maxLength = right - i + 1;
                    startPoint = i;
                    
                    }
                
                }
            }
            
        }

        return s.substring(startPoint, startPoint + maxLength);
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(solve(s));
    }
}
