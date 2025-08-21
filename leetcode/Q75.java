public class Q75 {
    class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0, mid = 0, right = n - 1;
        while(mid <= right){
            if(nums[mid] == 0){
                int temp = nums[left];
                nums[left++] = nums[mid];
                nums[mid++] = temp;
            }else if(nums[mid] == 1){
                mid++;
            }else {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right--] = temp;
            }
        }
    }
}
}
