package AmazonLeetcode.day2;

public class SearchInsertPosition {
    public static void main(String[] args) {

    }
    class Solution {
        public int searchInsert(int[] nums, int target) {

            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                }
                else if (target < nums[mid]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }

            // If target not found, left is the insert position
            return left;
        }
    }

}
