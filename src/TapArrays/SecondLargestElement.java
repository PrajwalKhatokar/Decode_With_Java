//9.print the SecondLargest element in the given array -> SecondLargestElement.java
//package TapArrays;

import java.util.Scanner;

public class SecondLargestElement {



    static int Second(int arr[]) {
        int FirstLargest = arr[0], SecondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) { //index start from 1 becuse 1st index large edhare condtion get fails
            if (arr[i] > FirstLargest) {
                SecondLargest = FirstLargest; // i should not lose 1st element i need to give to second largest if i get the largest na
                FirstLargest = arr[i]; // largest found and we are giving that to him
            } else if (arr[i] > SecondLargest && arr[i] != FirstLargest ) { // arr[i] != FirstLargest  check the case 2 output
                SecondLargest = arr[i];
            }
        }
        return SecondLargest;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=Second(arr);
        System.out.println("Second Largest element is: "+res);
    }
}

//case 1:

//Output: (with this condittion in  the second largest arr[i] != FirstLargest )
//enter the size of the array
//5
//        5 4 6 2 6 1 3
//Second Largest element is: 5

// case 2:
//Output: (without this condittion in  the second largest arr[i] != FirstLargest )
//enter the size of the array
//5
//        6 4 6 2 6 1 3
//Second Largest element is: 6


// see in case 1, 6 and 6 both are largest so i gave condtion

// but in case if u want 6 and 6 is this should be 1st largest and second largest then dont put
//conditon play according to the requirement.