// Problem: Two Sum
// Approach: Brute force - check all pairs

public class TwoSum{
    public int[] twoSum(int[] nums, int target) {

        // loop through each element
        for (int i = 0; i < nums.length; i++) {

            // check next elements
            for (int j = i + 1; j < nums.length; j++) {

                // if sum equals target
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }
}