//5.to print the index of the maximum value and traversal allowed only once
package TapArrays;

import java.util.Scanner;

public class MaxIndex {
    static long max=Integer.MIN_VALUE;  //  if i give max as 0 ,and if array if -1 -3 -5 i get answer as 0 only o max alwa
    static long index=0;
    static long maximo(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] arr= new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        long indexi=maximo(arr);
        System.out.println("maximum number is at the index " +indexi);

    }
}
//
//Output:
//
//enter the size of the array
//5
//        100 20 60 4 80
//maximum number is at the index 0