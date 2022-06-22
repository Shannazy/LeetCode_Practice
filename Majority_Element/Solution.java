package Majority_Element;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> lookUp = new HashMap<Integer, Integer>();
        int Max = nums[0];
        for (int i : nums){
            if(lookUp.putIfAbsent(i, 1) != null){
                int value = lookUp.get(i);
                lookUp.replace(i, ++value);
                if(lookUp.get(Max)<lookUp.get(i)){
                    Max = i;
                }
            }
        }
      return Max;
    }

}
