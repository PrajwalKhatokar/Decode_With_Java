//19.Given an Sorted array of the Integer Value  FInd the Ocurrence of the each ELement in an
//array
package TapArrays;

import java.util.Scanner;

public class SortedArrayNumberOccurence {

    static void  NumberOfOcuurenceSortedarray(int[] arr){
        int count=1;
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(arr[i] + " " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length-1] + "  " +count);

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
       NumberOfOcuurenceSortedarray(arr);
    }
}
 //Output:

//enter the size of the array
//8
//enter the Array elements
//2 2 2 3 4 4 4 1
//        2 3
//        3 1
//        4 3
//        1 1


