//14.find the Minimum Pair Product of the array ->MinPairProduct.java
package TapArrays;

import java.util.Scanner;

public class MinPairProduct {
     static int MinPairingProduct(int arr[]) {
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

             int p1 = SecondLargest * FirstLargest;// nan array element
             //+ve edhare p1 wil work negative edhare p2 will work.
             int p2 = SecondSmall * FirstSmall; // negative ge

             int p3 = FirstLargest *  FirstSmall; // for combinational both positive and negative value

             return Math.min(p1,Math.min(p2,p3));//first inner checked p2 and p3 nali who big,
//         competate with the p1 ok simple.
         }

         public static void main(String[] args){
             System.out.println("enter the size of the array");
             Scanner sc = new Scanner(System.in);
             int n=sc.nextInt();
             int[] arr = new int[n];
             for (int i=0;i<arr.length;i++){
                 arr[i]=sc.nextInt();
             }
             int min=MinPairingProduct(arr);
             System.out.println("Minimum pair Product of the Array Pair is: "+min);

         }

     }


//
//output 1: for the positive value:
//
//enter the size of the array
//5
//        7 1 6 9 4
//Minimum pair Product of the Array Pair is: 4

//Output 2://for negative values

//C:\Java_2024\jdk_22\bin\java.exe --enable-preview "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=53712:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\prajw\OneDrive\Documents\PRAJWAL\pw142024dsa\JavaShot\out\production\JavaShot TapArrays.MinPairProduct
//enter the size of the array
//5
//        -7 -1 -6 -9 -4
//Minimum pair Product of the Array Pair is: 4


//Output :3// combinational for the postive and the negative values.

//enter the size of the array
//8
//        3 7 5 -9 -4  1 9 -1
//Minimum pair Product of the Array Pair is: -81

