package AmazonLeetcode;

public class MaxSubArray {
    public static void main(String[] args) {

    }

    class Solution {
        public int maxSubArray(int[] nums) {

            // maxsum stores the maximum subarray sum found so far (global best)
            int maxsum = nums[0];

            // currentsum stores the best subarray sum that ends at the current index
            int currentsum = nums[0];

            // Traverse the array from the second element
            for (int i = 1; i < nums.length; i++) {

                // Decide whether to:
                // 1) start a new subarray at current element
                // 2) continue the previous subarray
                currentsum = Math.max(nums[i], currentsum + nums[i]);

                // Update the global maximum if current subarray is better
                maxsum = Math.max(maxsum, currentsum);
            }

            // Return the maximum subarray sum
            return maxsum;
        }
    }

}
