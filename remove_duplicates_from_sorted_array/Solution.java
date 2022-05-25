package remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int uniques = 1;
        int CurrentNum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != CurrentNum) {
                nums[uniques] = nums[i];
                CurrentNum = nums[i];
                uniques++;
            }
        }

        return uniques;
    }
}
