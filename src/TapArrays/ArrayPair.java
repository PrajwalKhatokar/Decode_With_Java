//16.given an Array find the pairs of the Array-> ArrayPair.java
package TapArrays;

import java.util.Scanner;

public class ArrayPair {

    static void ArrayPairr(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        ArrayPairr(arr);//edhna cal madila andre yenu print hagalaa
    }
}
//
//Output:
//enter the size of the array
//5
//        3 7 5 2 1
//        3 7
//        3 5
//        3 2
//        3 1
//        7 5
//        7 2
//        7 1
//        5 2
//        5 1
//        2 1