//7.product of n-1 ,Storing in new array

package TapArrays;

import java.util.Scanner;

public class ProductOfNMinusOne {

    static int[] product(int[] arr) {
        int product=1;
        for (int i = 0; i < arr.length; i++) {

            product=product*arr[i];   // yela multiple madi itko

        }

        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i]=product/arr[i];  // multiple madi store in new array ie res[i]
        }

        return res;
    }


    public static void main(String[] args) {
        System.out.println("enter the Size of the Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = product(arr);// array can have yest adru reference ok na

        for (int i=0;i<arr.length;i++){
            System.out.print(result[i] +" ");
        }

    }
}
//output
//enter the Size of the Array
//5
//        1
//        4
//        3
//        5
//        2
//        120 30 40 24 60  // storing in new array