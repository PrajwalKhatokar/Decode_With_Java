//3.To Find the maximum value in the array

package TapArrays;

import java.util.Scanner;

public class MaxArray {
    static long max=Integer.MIN_VALUE;  //  if i give max as 0 ,and if array if -1 -3 -5 i get answer as 0 only o max alwa
    static long maximo(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] arr= new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        long big=maximo(arr);
        System.out.println("maximum number in the array is " +big);

    }
}

//Output:

//enter the size of the array
//5
//        10 20 6 4 80
//maximum number in the array is 80