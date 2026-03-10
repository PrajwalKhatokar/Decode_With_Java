package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart2;


// Question for Two Sum,

//2.Two Sum->TwoSum.java</br>
//</br>
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.</br>
//You may assume that each input would have exactly one solution, and you may not use the same element twice.</br>
//
//You can return the answer in any order.</br>
//Example 1:</br>
//</br>
//Input: nums = [2,7,11,15], target = 9</br>
//Output: [0,1]</br>
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]</br>
//</br>

//this is leetcode problem here no main method
//leetcode solution only logic
//Practise same thing in leetcode if u want  here i kept for  understanding and like
// notes
//nums = [2,7,11,15], target = 9</br>
// two element add madidre it should be equal to target hagirbeku and avre target kotidaare ok na
// i (pointing to the first element ok na) traverse 1 time
// j start two loop beku inside loop 5 tyms work ie ie 2 adre 2 na we check with the 7 11 and 15 not
// we not start j =1 because i and j both 3 and 3 itself comaprsion bad so j start with the i+1
    class TwoSum {
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

