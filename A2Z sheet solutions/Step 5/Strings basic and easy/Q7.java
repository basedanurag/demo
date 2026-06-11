public class Q7 {
    public static boolean isAnagram(String s , String t){
        int [] freq = new int[26];
        if(s.length() != t.length()) return false;
        
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            freq[t.charAt(i) - 'a']--;

        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
         // Create an instance of the Solution class
        String Str1 = "INTEGER";  // Example string to check
        String Str2 = "TEGERNI";  // Example string to check

        if(isAnagram(Str1.toLowerCase(), Str2.toLowerCase())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
