package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart2;


//if u see the above document perfectly ok
//4.Rotate Array:--> RotateArray.java</br>

//notes pdf..in onedrive interview Strict

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.</br>
//
//Input: nums = [1,2,3,4,5,6,7], k = 3</br>
//Output: [5,6,7,1,2,3,4]</br>
//Explanation:</br>
//rotate 1 steps to the right: [7,1,2,3,4,5,6]</br>
//rotate 2 steps to the right: [6,7,1,2,3,4,5]</br>
//rotate 3 steps to the right: [5,6,7,1,2,3,4]</br>


//this is leetcode problem here no  main method
//leetcode solution only logic
//Practise same thing in leetcode if u want  here i kept for  understanding and like
// notes
//189 Rotate Array edhu.. for notes refer pdf 4830 drive notes
class Solution {
    // 0 1 2 3       4     5   6
    // 1 2 3 4       5     6   7 if k=3 n=7 .....if k> n then use k=k%n
    // 0     n-k-1   n-k       n-1
    // 5 6 7 1 2 3 4
    // reverse 1st part o to n-k-1
    // reverse 2nd part n-k to n-1
    // amele full 0 to n-1
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int nums[],int k){
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}


//....................................................................................

//import java.util.Scanner;
//
//public class RotateArray {
//
//    // 🔴 Reverse function (same as your code)
//    public static void reverse(int[] nums, int i, int j) {
//        while (i < j) {
//            int temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//            i++;
//            j--;
//        }
//    }
//
//    // 🔴 Rotate function
//    public static void rotate(int[] nums, int k) {
//        int n = nums.length;
//
//        k = k % n; // handle large k
//
//        // Step 1: reverse first part
//        reverse(nums, 0, n - k - 1);
//
//        // Step 2: reverse second part
//        reverse(nums, n - k, n - 1);
//
//        // Step 3: reverse whole array
//        reverse(nums, 0, n - 1);
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // 🔹 Input size
//        System.out.print("Enter size: ");
//        int n = sc.nextInt();
//
//        int[] nums = new int[n];
//
//        // 🔹 Input array
//        System.out.println("Enter elements:");
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//
//        // 🔹 Input k
//        System.out.print("Enter k: ");
//        int k = sc.nextInt();
//
//        // 🔹 Call rotate
//        rotate(nums, k);
//
//        // 🔹 Output result
//        System.out.println("Rotated array:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(nums[i] + " ");
//        }
//
//        sc.close();
//    }
//}