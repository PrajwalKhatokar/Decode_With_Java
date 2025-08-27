//12.find the minimum pair sum of the Array  ->MinPairSum.java
package TapArrays;

import java.util.Scanner;

public class MinPairSum {

    static int MinSumPairing(int arr[]){
            int FirstSmall = arr[0], SecondSmall = Integer.MAX_VALUE;

            for (int i = 1; i < arr.length; i++) {//index start from 1 becuse 1st index large edhare condtion get fails
                if (arr[i] < FirstSmall) {
                    SecondSmall = FirstSmall; // i should not lose 1st element i need to give to second largest if i get the largest na
                    FirstSmall = arr[i]; // largest found and we are giving that to him
                } else if (arr[i] < SecondSmall && arr[i] != FirstSmall ) { // arr[i] != FirstSmall  check the case 2 output
                    SecondSmall = arr[i];
                }
            }
        return SecondSmall + FirstSmall;
    }

    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=MinSumPairing(arr);
        System.out.println("Minimum sum of the Array Pair is: "+res);
    }

}

//output:
//enter the size of the array
//8
//        2
//        3
//        7
//        5
//        4
//        6
//        9
//        1
//Minimum sum of the Array Pair is: 3