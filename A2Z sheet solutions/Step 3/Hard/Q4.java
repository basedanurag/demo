import java.util.*;

public class Q4 {
    public static List<List<Integer>> bruteforce(int[] arr, int target){
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int j2 = j+ 1; j2 < arr.length; j2++) {

                    for (int k = j2 +1 ; k < arr.length; k++) {
                        if(arr[i]+ arr[j]+ arr[j2]+ arr[k] == target){
                            
                             List<Integer> ans= Arrays.asList(arr[i] , arr[j], arr[j2], arr[k]);
                             Collections.sort(ans);
                             st.add(ans);

                        }
                        
                    }
                }
            }
        }
        return new ArrayList<>(st);
    }
    public static List<List<Integer>> betterAprroach(int[]arr, int target){
    
            Set<List<Integer>> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
               
                for (int j = i + 1; j < arr.length; j++) {
                     Set<Integer> set2 = new HashSet<>();
                     
                    for (int j2 = j + 1; j2 < arr.length; j2++) {
                        int fourth  = target - (arr[i] + arr[j] + arr[j2]);
                        
                        if(set2.contains(fourth)){
                            List<Integer> ans = Arrays.asList(arr[i], arr[j], arr[j2], fourth);
                            Collections.sort(ans);
                            set.add(ans);

                        }
                    set2.add(arr[j2]);
                }
                
            }
        }
        return new ArrayList<>(set);
    }
    public static List<List<Integer>> optimalApproach(int[]arr, int target){
      int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort array
        Arrays.sort(arr);

        // Step 2: First loop for first number
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            // Step 3: Second loop for second number
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                // Step 4: Two pointers
                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (long) arr[i] + arr[j] +
                               arr[left] + arr[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(arr[i], arr[j],
                                              arr[left], arr[right]));

                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[right] == arr[right - 1]) right--;

                        left++;
                        right--;
                    }
                    else if (sum < target) left++;
                    else right--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        System.out.println(optimalApproach(arr, 0));
        System.out.println(bruteforce(arr, 0));
        System.out.println(betterAprroach(arr, 0));
    }
}
