package ArrayPwSkill.LeetCodeProblems;


//this is leetcode problem here no  main method
//leetcode solution only logic
//Practise same thing in leetcode if u want  here i kept for  understanding and like
// notes
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j}; // anonymous array
                    }
                }
            }
            return new int[]{}; // if not found
        }
    }
////shortcut of writing->case 1: if indeex not found
//int[] arr = new int[2];
//arr[0] = 0;
//arr[1] = 1;
// return new int[]{i, j};
// Here:

// Java creates the array

// Java does NOT give it a name

// Java immediately returns it

// 👉 This is called an anonymous array

