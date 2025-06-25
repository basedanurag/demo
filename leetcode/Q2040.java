public class Q2040 {
    class Solution {
    public long findCountSmallest(int[] nums1 , int[] nums2, long minProduct){
        long count = 0;
        int n  = nums2.length;
        for(int a : nums1){
            if(a>= 0){
                int l = 0, r = n - 1, pos = -1;
                while( l <= r){
                    int m  = l + ( r - l )/ 2;
                    long product = 1L * a * nums2[m];
                    if(product <= minProduct){
                        pos = m;
                        l = m + 1;    
                    }else{
                        r = m - 1;
                    }
                }
                count += (pos + 1);
            }else{
                  int l = 0, r = n - 1, pos = n;
                while( l <= r){
                    int m  = l + ( r - l )/ 2;
                    long product = 1L * a * nums2[m];
                    if(product <= minProduct){
                        pos = m;
                        r  = m - 1 ;    
                    }else{
                        l = m + 1;
                    }
                }
                count += (n - pos);

            }
            
        }
return count;
    }
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long result = 0;
        long l = -1_000_000_0000L; //min product
        long r = 1_000_000_0000L; //max product 

        while(l <= r){
            long midProduct  =  l + (r - l)/ 2;

            long countSmall = findCountSmallest(nums1, nums2, midProduct);

            if(countSmall >= k){
                result =  midProduct;
                r = midProduct - 1;
            }else{
                l = midProduct + 1;
            }
        }
        return result;
    }
}
}
