import java.util.*;

public class Q2 {
    public static List<Integer> freq(int[] arr){
        Map<Integer, Integer> hmp = new HashMap<>();
        List<Integer> ans  = new ArrayList<>();
        for(int i : arr){
            hmp.put(i, hmp.getOrDefault(i,0)+ 1);
        }
        for(Map.Entry<Integer,Integer> entry : hmp.entrySet()){
            if(entry.getValue() > arr.length/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
     public static  List<Integer> majorityElement(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n  = arr.length;
        int element1 = 0;
        int count1 = 0;
        int element2 = 0;
        int count2 = 0;
        for(int i : arr){
        if(i == element1){ 
            count1++;
        }
        else if(i == element2){ 
            count2++;
        
        }
        else if(count1 == 0){
            element1 = i;
            count1+=1;
        }
        else if(count2 == 0){
            element2 = i;
            count2+= 1;
        }

        else{
            count1--;
            count2--;
        }

      }
        // verification
        count1 = 0;
        count2 = 0;
         for (int num : arr) {
        if (num == element1) count1++;
        else if (num == element2) count2++;
         }
        if (count1 > n / 3) ans.add(element1);
        if (count2 > n / 3) ans.add(element2);
        
      return ans;
    }

    public static void main(String[] args) {
        int arr [] = {1, 2, 1, 1, 3, 2, 2,1,1,1,1,1,2,3,3,3,3,3,3,3,3};
        System.out.println(freq(arr));
        System.out.println(majorityElement(arr));
    }
}
