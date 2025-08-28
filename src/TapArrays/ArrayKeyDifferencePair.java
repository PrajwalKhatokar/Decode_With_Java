package TapArrays;

import java.util.Scanner;

public class ArrayKeyDifferencePair {
    static void DifferencePair(int[] arr,int key){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] - arr[j]==key || arr[j] - arr[i]==key  ){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the key element");
        int key=sc.nextInt();
        System.out.println("enter the Array elements");
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        DifferencePair(arr,key);
    }
}
//Output:
//enter the size of the array
//5
//enter the key element
//2
//enter the Array elements
//3 4 1 2 5
//        3 1
//        3 5
//        4 2
