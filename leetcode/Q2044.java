public class Q2044 {
class Solution {

    public int countMaxOrSubsets(int[] nums) {
        int maxOrValue = 0;
        for (int num : nums) {
            maxOrValue |= num;
        }
        return countSubsets(nums, 0, 0, maxOrValue);
    }

    private int countSubsets(
        int[] nums,
        int index,
        int currentOr,
        int targetOr
    ) {
        // Base case: reached the end of the array
        if (index == nums.length) {
            return (currentOr == targetOr) ? 1 : 0;
        }

        // Don't include the current number
        int countWithout = countSubsets(nums, index + 1, currentOr, targetOr);

        // Include the current number
        int countWith = countSubsets(
            nums,
            index + 1,
            currentOr | nums[index],
            targetOr
        );

        // Return the sum of both cases
        return countWithout + countWith;
    }
}
}
