
import java.util.ArrayList;

public class Q13 {
    
    public static double MedianBrute(int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0; 
        int j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1 + n2;
        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]) ans.add(arr1[i++]);
            else
                ans.add(arr2[j++]);
        }
        while (i < n1) {
            ans.add(arr1[i++]);
        }
        while (j < n2) {
            ans.add(arr2[j++]);
        }
        if (n % 2 == 1) {
            return ans.get(n / 2);
        }
        return (ans.get(n / 2 - 1) + ans.get(n / 2)) / 2.0;
    }   
    public static double optimal(int [] arr1, int arr2[]){
        int i = 0; 
        int j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1 + n2;
        int ind2 = n/2;
        int ind1 =ind2 - 1 ; 
        int ind1el = -1, indel2 = -1;
        int count = 0;
        while (i < n1 && j < n2) {
            if(arr1[i] < arr2[j]){
                if(count == ind1)  ind1el = arr1[i];
                if(count == ind2) indel2 = arr1[i];
                count++;
                i++;
            }else{
                if(count == ind1)  ind1el = arr2[j];
                if(count == ind2) indel2 = arr2[j];
                count++;
                j++;
            }
            
        }
        while (i < n1) {
             if(count == ind1)  ind1el = arr1[i];
                if(count == ind2) indel2 = arr1[i];
                count++;
                i++;
            
        }
        while (j < n2) {
            if(count == ind1)  ind1el = arr2[j];
            if(count == ind2) indel2 = arr2[j];
            count++;
            j++;
        }

        if (n % 2 == 1) {
            return indel2;
        }
        return (double)((double) (ind1el + indel2)/ 2);


    }
    public static double MostOptimal(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2  = arr2.length;
        if(n1 > n2) return MostOptimal( arr2, arr1);
        int low = 0;
        int high =  n1;
        int left =  (n1 + n2 + 1)/2;
        while (low <= high) {
            int mid1 = (low+ high) >> 1;
            int mid2 = left - mid1 ;
            int l1 = Integer.MIN_VALUE, l2=  Integer.MIN_VALUE;
             int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

             if(mid1 < n1) r1 = arr1[mid1];
             if(mid2 < n2) r2 = arr2[mid2];
             if (mid1 - 1 >= 0) l1 = arr1[mid1 -1];
             if (mid2 - 1 >= 0) l2 = arr2[mid2 - 1];
             // valid part
             if(l1 <= r2 && l2 <= r1) {
                 if ((n1 + n2)% 2 == 1) {
                    return Math.max(l1, l2);

                 }else{
                    return (double) (Math.max(l1, l2) + Math.min(r1 , r2))/2.0;

                 }
             }
             else if(l1 > r2){
                high = mid1 - 1;
             }
             else{
                low = mid1 + 1;
             }
            
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2};
        int arr2[]= {};
        System.out.println(MostOptimal(arr, arr2));
    }
}
