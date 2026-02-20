package JSixTechnologiesTraineCode.Arrays.ArrayBasics;

import java.util.Scanner;

public class Secondlargest {
    public static void main(String[] args) {
//        [5, 9, 2, 12, 7]
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        // INPUT FROM KEYBOARD
        System.out.println("enter the Array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // logic starts

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first=arr[i];         // update ie arr[i] is 1st large sekide put in first
            } else {
                if (arr[i] > second && arr[i] != first) {//2nd cond to handle 10 10 9
                     second=arr[i];
                }
            }
        }
        System.out.println("Second Largest element is :" +second);
    }
}

//Enter the Size of the Array
//5
//enter the Array Elements
//5
//        9
//        7
//        12
//        2
//Second Largest element is :9
