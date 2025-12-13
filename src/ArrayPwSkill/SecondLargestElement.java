package ArrayPwSkill;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the number");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }

        //first maximum nodona
        int largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);//value update madidre ne alwa nexxt for loop
            //will compare so that i can print it ok na.....doing to get maximo
        }

        for (int i = 0; i < n; i++) {
        if (largest!=arr[i]){ // means largest array nali erbardhu haga matra inside ogu anta
            SecondLargest = Math.max(SecondLargest,arr[i]);
           }
        }
        System.out.println("first Largest is :"+largest);
        System.out.println("Second Largest is:"+SecondLargest);



    // case 2:Input: 5
    //Array: 10 10 10 10 10

    if (SecondLargest == Integer.MIN_VALUE) {
        System.out.println("Second largest element does not exist");
    } else {
        System.out.println("Second Largest is: " + SecondLargest);
    }

}
}
//normal output:

//enter the size of the number
//5
//enter the array elements:
//        30 50 60 70 90
//first Largest is :90
//Second Largest is:70
//Second Largest is: 70
//
//
//OutPut:
//
//special case::if i have two largest the print the index
//enter the size of the number
//5
//enter the array elements:
//        10 10 10 10 10
//first Largest is :10
//Second Largest is:-2147483648
//Second largest element does not exist
//
//