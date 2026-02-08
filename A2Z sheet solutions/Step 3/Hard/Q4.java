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
        Arrays.sort(arr);
        int left  = 0;
        int right = n - 1;
        List<List<Integer>> ans  = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            left = i + 1;
            if(i > 0 && arr[i] == arr[i - 1]){
                continue;
            }
            while(left < right){
                int mid = (left + right)/2;
                int sum = arr[i] + arr[left] +arr[mid]+ arr[right];


                if ( sum > 0){
                    right--;
                }else if(sum < 0){
                    left++;
                    mid++; 
                }else if(sum == target){
                    List<Integer> temp =  Arrays.asList(arr[i], arr[left], arr[mid], arr[right]);
                    ans.add(temp);
                    left++;
                    mid++;
                    right--;
                    while(left < right && arr[left] == arr[left - 1]) left++;
                    while(left < right && arr[right] == arr[right + 1]) right--;
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
