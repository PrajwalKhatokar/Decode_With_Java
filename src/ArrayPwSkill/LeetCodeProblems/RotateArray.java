package ArrayPwSkill.LeetCodeProblems;
//this is leetcode problem here no  main method
//leetcode solution only logic
//Practise same thing in leetcode if u want  here i kept for  understanding and like
// notes
//189 Rotate Array edhu.. for notes refer pdf 4830 drive notes
public class RotateArray {
    class Solution {
        public void reverse(int[] nums,int i,int j){
            while(i<=j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        public void rotate(int[] nums, int k) {
            int n=nums.length;
            k=k%n;
            reverse(nums,0,n-k-1);
            reverse(nums,n-k,n-1);
            reverse(nums,0,n-1);
        }
    }
}
