//10.print the SecondSmallest element in the given array -> SecondSmallest.java
//package TapArrays;
package TapArrays;
import java.util.Scanner;


import java.util.Scanner;

public class SecondSmallest {



    static int Second(int arr[]) {
        int FirstSmall = arr[0], SecondSmall = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {//index start from 1 becuse 1st index large edhare condtion get fails
            if (arr[i] < FirstSmall) {
                SecondSmall = FirstSmall; // i should not lose 1st element i need to give to second largest if i get the largest na
                FirstSmall = arr[i]; // largest found and we are giving that to him
            } else if (arr[i] < SecondSmall && arr[i] != FirstSmall ) { // arr[i] != FirstSmall  check the case 2 output
                SecondSmall = arr[i];
            }
        }
        return SecondSmall;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=Second(arr);
        System.out.println("Second Smallest element is: "+res);
    }
}

//output:
//
//enter the size of the array
//5
//        6 4 2 6 1 3
//Second Smallest element is: 2
