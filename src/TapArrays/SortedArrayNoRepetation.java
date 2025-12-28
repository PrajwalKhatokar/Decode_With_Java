//20.given the sorted Array of the integer value print all the elements of the array without repeating
package TapArrays;

import java.util.Scanner;

public class SortedArrayNoRepetation {
    static void SortedArrayNoRepeat(int[] arr){
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
                System.out.println(arr[arr.length-1]); //print after for loop manually acessing last element
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
        SortedArrayNoRepeat(arr);

    }
}

//Output:
//enter the size of the array
//8
//enter the Array elements
//2 2 2 3 4 4 4 4
//        2
//        3
//        4