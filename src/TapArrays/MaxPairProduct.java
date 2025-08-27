//13.find the Maximum Pair Product of the array ->MaxPairProduct.java

package TapArrays;

import java.util.Scanner;

public class MaxPairProduct {
    static int MaxPairingProduct(int arr[]){
        int FirstLargest = arr[0], SecondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) { //index start from 1 becuse 1st index large edhare condtion get fails
            if (arr[i] > FirstLargest) {
                SecondLargest = FirstLargest; // i should not lose 1st element i need to give to second largest if i get the largest na
                FirstLargest = arr[i]; // largest found and we are giving that to him
            } else if (arr[i] > SecondLargest) { // arr[i] != FirstLargest  check the case 2 output
                SecondLargest = arr[i];
            }
        }
        int FirstSmall = arr[0], SecondSmall = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {//index start from 1 becuse 1st index large edhare condtion get fails
            if (arr[i] < FirstSmall) {
                SecondSmall = FirstSmall; // i should not lose 1st element i need to give to second largest if i get the largest na
                FirstSmall = arr[i]; // largest found and we are giving that to him
            } else if (arr[i] < SecondSmall) { // arr[i] != FirstSmall  check the case 2 output
                SecondSmall = arr[i];
            }
        }

        int p1= SecondLargest * FirstLargest;// nan array element
        //+ve edhare p1 wil work negative edhare p2 will work.
        int p2= SecondSmall * FirstSmall;
        return p1>p2 ? p1 : p2;//p1 greater than p2 return p2
    }

    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=MaxPairingProduct(arr);
        System.out.println("Maximum pair Product of the Array Pair is: "+max);

    }

}

//Output:1

//enter the size of the array
//5
//        7 1 6 9 4
//Maximum pair Product of the Array Pair is: 63

//Output 2:

//enter the size of the array
//5
//        -7
//        -1
//        -6
//        -9
//        -4
//Maximum pair Product of the Array Pair is: 63