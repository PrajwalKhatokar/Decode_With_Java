//15.Linear search ,Find the key element in the given array and return its index
//        -> LinearSearch.java
package TapArrays;

import java.util.Scanner;

public class LinearSearch {

    static int linear(int[] arr,int key){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the search element in the given array");
        int key = sc.nextInt();
        int res=linear(arr,key);
        System.out.println("key element is found at the index: "+res);
    }
}
//output:

//enter the size of the array
//8
//        3 1 2 7 5 1 9 4
//enter the search element in the given array
//7
//key element is found at the index: 3
