package AmazonLeetcode.Top_injections;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

    }
}
    class Solution {
        public int longestOnes(int[] nums, int k) {

            // left pointer:
            // This marks the starting position of my sliding window.
            // It moves forward only when my zero count crosses the given constraint k.
            int left = 0;

            // zeroCount:
            // This keeps track of how many zeros are present in the current window.
            // Zero count should never be more than k,
            // because we are allowed to flip only k zeros.
            int zeroCount = 0;

            // maxLen:
            // This stores the maximum length of a valid window found so far.
            // At the end, this will be my final answer.
            int maxLen = 0;

            // right pointer:
            // This pointer expands the window by moving forward through the array.
            for (int right = 0; right < nums.length; right++) {

                // Step 1:
                // Include the element at the right pointer into the window.
                // If the element is 0, it means we are using one flip,
                // so we increase the zeroCount.
                if (nums[right] == 0) {
                    zeroCount++;
                }

                // Step 2:
                // If zeroCount becomes greater than k,
                // it means our window violates the constraint.
                // So we must shrink the window from the left side.
                while (zeroCount > k) {

                    // Before moving the left pointer,
                    // check if the element leaving the window is a zero.
                    // If it is zero, we reduce zeroCount,
                    // because that zero is no longer inside the window.
                    if (nums[left] == 0) {
                        zeroCount--;
                    }

                    // Move the left pointer forward
                    // to shrink the window and try to satisfy the constraint.
                    left++;
                }

                // Step 3:
                // At this point, the window is valid because zeroCount <= k.
                // We calculate the number of elements in the window.
                // We use right - left + 1 because both left and right are inclusive.
                int currentWindowLength = right - left + 1;

                // Update the maximum window length found so far.
                maxLen = Math.max(maxLen, currentWindowLength);
            }

            // Return the maximum valid window length.
            return maxLen;
        }
    }
