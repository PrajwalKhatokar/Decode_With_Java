//given an array of the integer values in the sorted array print the unique elements
package TapArrays;

import java.util.Scanner;

public class SortedArrayPrintUniqueElement {
    static void PrintOnce(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {

                    System.out.println(arr[i]);
                }
                count = 1;
            }
        }
        if (count == 1) {
            System.out.println(arr[arr.length - 1]);
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the Array elements");
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        PrintOnce(arr);
    }
}

//enter the size of the array
//8
//enter the Array elements
//2 2 2 3 4 4 4 23
//        3
//        23