import java.util.HashSet;
import java.util.Arrays;


class Q2559 {
    //test case using main function
    public static void main(String[] args) {
        Q2559 solution = new Q2559();
        String[] words = {"apple", "orange", "pear"};
        int[][] queries = {{0, 1}, {1, 2}};
        int[] result = solution.vowelStrings(words, queries);
        System.out.println(Arrays.toString(result)); // Expected Output: [2, 1]
    }
    
    public int[] vowelStrings(String[] words, int[][] queries) {
       int n = words.length;
       int prefixsum[] = new int [n];
       prefixsum[0] = isVowel(words[0]);
       for(int i=1;i<n ; i++){
        prefixsum[i] = prefixsum[i-1] + isVowel(words[i]);
       }
       int m = queries.length;
       int ans[] = new int[m];
       for(int i=0; i<m ; i++){
        int l =queries[i][0];
        int r = queries[i][1];
        int res = prefixsum[r];
        if(l!=0){
            res =  res - prefixsum[l-1];
        }
        ans[i]=res;

        }
        return ans;

       }
       public int isVowel(String word){
        HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        if(set.contains(first)&& set.contains(last)){
            return 1;

        } 
        return 0;
   }
 }
