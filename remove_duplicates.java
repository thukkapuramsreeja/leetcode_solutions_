class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1; //single elements starts here

        for(int i=1;i<nums.length;i++){ //nums array
            if(nums[i]!=nums[i-1]){ // compare with previous if different → keep it
                nums[k]=nums[i]; //seperate from nums -> k
                k++; //increment k
            }
        
        }
        return k; //we will get seperate(unique elements) here
    }
}