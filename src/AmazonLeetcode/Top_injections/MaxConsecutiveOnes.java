package AmazonLeetcode.Top_injections;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

    }

    class Solution {
        public int longestOnes(int[] nums, int k) {

            // left pointer = start of sliding window
            int left = 0;

            // zeroCount = number of zeros in current window
            // (i.e., how many flips we are using)
            int zeroCount = 0;

            // maxLen = maximum length of any valid window found
            int maxLen = 0;

            // right pointer expands the window
            for (int right = 0; right < nums.length; right++) {

                // Step 1: include nums[right] into the window
                if (nums[right] == 0) {
                    // we used one flip
                    zeroCount++;
                }

                // Step 2: if flips exceed k, shrink window from left
                while (zeroCount > k) {

                    // if the element leaving the window is 0,
                    // we free one flip
                    if (nums[left] == 0) {
                        zeroCount--;
                    }

                    // move left forward to shrink window
                    left++;
                }

                // Step 3: window is valid here (zeroCount <= k)
                // calculate current window length
                int currentWindowLength = right - left + 1;

                // update maximum length found so far
                maxLen = Math.max(maxLen, currentWindowLength);
            }

            // final answer
            return maxLen;
        }
    }

}
