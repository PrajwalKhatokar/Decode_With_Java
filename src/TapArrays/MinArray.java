//4.To Find the minimum value in the array

package TapArrays;

import java.util.Scanner;

public class MinArray {
    static long mini=Integer.MAX_VALUE;  // see case 2 output
    static long minimum(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[i]<mini){
                mini=arr[i];
            }
        }
        return mini;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] arr= new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        long least=minimum(arr);
        System.out.println("minimum number in the array is " +least);

    }
}

//Output:
//
//enter the size of the array
//5
//        -12 -877 -1111 -90 0 112
//minimum number in the array is -1111


//why? i given Integer.MAX_VALUE.?

//enter the size of the array
//5
//        7
//        5
//        9
//        99
//        7
//minimum number in the array is 0