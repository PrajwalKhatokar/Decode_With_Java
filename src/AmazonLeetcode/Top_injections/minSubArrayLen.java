package AmazonLeetcode.Top_injections;

public class minSubArrayLen {
    public static void main(String[] args) {

    }

    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int left=0; //my left window wil intialuy 0 it wil move
            //2,3,1,2=8 ok 8>=8 but minlength = 4
            // so it remove the current element ie 2 it remove from itswindow
            // next new window 3,1,2,4 left window wil work until i get value ie >= target and mainly important is minlength is needed
            int min=Integer.MAX_VALUE;  // max we giving later min we calcilate at the end no worries.
            int currentsum=0;

            for(int right=0;right<nums.length;right++){ //right window expanding

                currentsum+=nums[right]; //for adding pair values to get target

                while(currentsum>=target){ // here i got currentele >= target but not sure about its length next find min length ok

                    min=Math.min(min,right-left+1);
                    currentsum-=nums[left]; // if minlength is not minmum than previous shrink that left current ele
                    left++; // after shrink move i get new left window
                }

            }

            return min==Integer.MAX_VALUE? 0:min; // returing 0 if no element for hident test case,if min found return min
        }
    }

}
