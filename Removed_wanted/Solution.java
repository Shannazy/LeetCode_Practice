package Removed_wanted;

public class Solution {

    public int removeElement(int[] nums, int val) {
    int pointer = 0;
    for (int i:nums){
        if(i != val) {
            nums[pointer] = i;
            pointer++;
        }
    }

        return pointer;
    }

}
