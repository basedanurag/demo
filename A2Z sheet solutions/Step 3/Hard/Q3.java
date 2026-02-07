import java.util.*;

public class Q3 {
    public static List<List<Integer>> bruteforce(int[] arr){
       // List<List<Integer>> res  = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        if(n < 3){
            return new ArrayList<>(set);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int j2 = j + 1; j2 < arr.length; j2++) { 
                    if (arr[i] + arr[j] + arr[j2] == 0){
                        List<Integer> ans= Arrays.asList(arr[i],arr[j],arr[j2]);
                        Collections.sort(ans);
                        set.add(ans);
                        
                    }
                    
                }
                
            }
            
        }
        return new ArrayList<>(set);
    }
    public static List<List<Integer>> better(int[] arr){
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set2 = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int third = - (arr[i] + arr[j]);
                if(set2.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(temp);
                    set.add(temp);
                }
                set2.add(arr[j]);
            }
        }
        return new ArrayList<>(set);
    }
    public static List<List<Integer>> optimalApproach(int[]arr){
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
                int sum = arr[i] + arr[left] + arr[right];

                if ( sum > 0){
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    List<Integer> temp =  Arrays.asList(arr[i], arr[left], arr[right]);
                    ans.add(temp);
                    left++;
                    right--;
                    while(left < right && arr[left] == arr[left - 1]) left++;
                    while(left < right && arr[right] == arr[right + 1]) right--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
                    // 0,1,2,3, 4 ,5
        System.out.println(bruteforce(arr));
        System.out.println(better(arr));
        System.out.println(optimalApproach(arr));
    }
}
