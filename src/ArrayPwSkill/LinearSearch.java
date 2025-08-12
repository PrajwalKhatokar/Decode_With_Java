package ArrayPwSkill;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the target element");
        int target = sc.nextInt();

        System.out.println("enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int n = arr.length;
        //taking input
        System.out.println("enter the array elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // logic starts
        boolean flag = false;//initially nothing got so false
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {  //if curent ele is equal to target element
                flag = true; //if got break the loop
                break;
            }
        }

            if (flag == true) {
                System.out.println("target element found");
            } else {
                System.out.println("element not found");
            }

        }
    }

// OutPut:

// enter the target element
// 4
// enter the size of the array
// 5
// enter the array elements
// 10
// 56
// 78
// 4
// 74
// target element found

// enter the target element
// 25
// enter the size of the array
// 4
// enter the array elements
// 12
// 78
// 96
// 36
// element not found


