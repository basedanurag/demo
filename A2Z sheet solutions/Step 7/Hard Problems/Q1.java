import java.util.ArrayList;
import java.util.List;

public class Q1{
    public boolean isPalindrome(String s , int start, int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void helper(int index, String s, List<List<String>> result, List<String> ans){
        // base case 
        if(index  == s.length()){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i = index; i< s.length(); i++){
            if(isPalindrome(s, index, i)){
                ans.add(s.substring(index, i + 1));
                helper(i + 1, s, result, ans);
                ans.remove(ans.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        helper(0, s, result, new ArrayList<>());

        return result;
    }
    public static void main(String[] args) {
        
    }
}