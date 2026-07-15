public class Q5 {
    public int[] singleNumber(int[] nums) {
        int num = 0;
        for(int i : nums){
            num ^= i;
        }
        int rightMost = (num & (num - 1) ^ num);

        int b1 = 0;
        int b2 = 0;

        for(int i = 0; i < nums.length; i++){
            if((nums[i] & rightMost) != 0){
                b1^= nums[i];
            }else{
                b2^= nums[i];
            }
        }
        return new int[] {b1, b2};
    }
    public static void main(String[] args) {
        
    }
}
