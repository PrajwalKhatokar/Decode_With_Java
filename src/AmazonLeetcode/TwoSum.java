package AmazonLeetcode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            // HashMap to store number -> index
            HashMap<Integer, Integer> map = new HashMap<>();

            // Loop through array
            for (int i = 0; i < nums.length; i++) {

                int current = nums[i];
                int needed = target - current;

                // Check if complement already exists
                if (map.containsKey(needed)) {
                    return new int[] { map.get(needed), i };
                }

                // Store current number with its index
                map.put(current, i);
            }

            // Problem guarantees one solution
            return new int[] {};
        }
    }

}
