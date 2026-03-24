// Problem: Move Zeroes
// Platform: LeetCode
// Approach: Two Pointer

class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0; // for placing non-zero elements

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i]; // store value
                nums[i] = nums[j];  // swap
                nums[j] = temp;

                j++; // move to next position
            }
        }
    }
}