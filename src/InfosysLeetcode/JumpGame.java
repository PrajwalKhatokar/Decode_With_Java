package InfosysLeetcode;

public class JumpGame {
    public static void main(String[] args) {

    }
//    ....................................................................
        public boolean canJump(int[] nums) {
//         Input: nums = [2,3,1,1,4]
//         Output: true

//         Input: nums = [3,2,1,0,4]
//         Output: false

            int maxreach=0;

            for(int i=0;i<nums.length;i++){
                if(i>maxreach){
                    return false;
                }
                maxreach=Math.max(maxreach,i+nums[i]);
            }

            return true;

        }
}
