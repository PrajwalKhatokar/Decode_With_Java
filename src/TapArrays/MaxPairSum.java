//11.find the maxiumum pair sum of the Array  ->MaxPairSum.java
package TapArrays;

import java.util.Scanner;

public class MaxPairSum {
    static int MaxSumPairing(int arr[]){
            int FirstLargest = arr[0], SecondLargest = Integer.MIN_VALUE;

            for (int i = 1; i < arr.length; i++) { //index start from 1 becuse 1st index large edhare condtion get fails
                if (arr[i] > FirstLargest) {
                    SecondLargest = FirstLargest; // i should not lose 1st element i need to give to second largest if i get the largest na
                    FirstLargest = arr[i]; // largest found and we are giving that to him
                } else if (arr[i] > SecondLargest) { // arr[i] != FirstLargest  check the case 2 output
                    SecondLargest = arr[i];
                }
            }
            return SecondLargest + FirstLargest;
        }

    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=MaxSumPairing(arr);
        System.out.println("Maximum sum of the Array Pair is: "+res);
    }

}
//  output::
//case 1
//enter the size of the array
//7
//        2 3 7 5 4 6 9 1
//Maximum sum of the Array Pair is: 16

//1st maximum is here 9 and second maximum is 7  9 +  7 = 16

//case 2:(included this condtion in the Secondlargest if case nali)
// i have 9 and 9 i need to get 18 but 16
//enter the size of the array
//7
//        2 3 7 5 4 6 9 9
//Maximum sum of the Array Pair is: 16

//case 3: now lets remove ie condtion ok na ie  && arr[i] != FirstLargest

//enter the size of the array
//7
//        2 3 7 5 6 9 9
//Maximum sum of the Array Pair is: 18