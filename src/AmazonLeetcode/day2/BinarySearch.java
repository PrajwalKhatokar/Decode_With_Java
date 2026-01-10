package AmazonLeetcode.day2;

public class BinarySearch {
    public static void main(String[] args) {

    }
    class Solution {
        public int search(int[] nums, int target) {

            /*
             * We are given a sorted array.
             * Our task is to find the index of target in O(log n) time.
             * Since the array is sorted, Binary Search is the best choice.
             */

            // 'left' represents the starting index of the current search space
            int left = 0;

            // 'right' represents the ending index of the current search space
            int right = nums.length - 1;

            /*
             * We continue searching as long as there is a valid search space.
             * If left becomes greater than right, it means the search space is empty
             * and the target does not exist in the array.
             */
            while (left <= right) {

                /*
                 * We calculate the middle index of the current search space.
                 * We use: left + (right - left) / 2
                 * instead of (left + right) / 2 to avoid integer overflow
                 * when left and right are very large numbers.
                 */
                int mid = left + (right - left) / 2;

                /*
                 * If the middle element is equal to the target,
                 * we have found the target, so return its index immediately.
                 */
                if (nums[mid] == target) {
                    return mid;
                }

                /*
                 * If the target is smaller than the middle element,
                 * then the target can only be present in the LEFT half.
                 * So we discard the right half (including mid)
                 * and move the 'right' boundary to mid - 1.
                 */
                else if (target < nums[mid]) {
                    right = mid - 1;
                }

                /*
                 * If the target is greater than the middle element,
                 * then the target can only be present in the RIGHT half.
                 * So we discard the left half (including mid)
                 * and move the 'left' boundary to mid + 1.
                 */
                else {
                    left = mid + 1;
                }
            }

            /*
             * If we exit the loop, it means the search space is empty
             * and the target was not found in the array.
             * Hence, return -1.
             */
            return -1;
        }
    }


}