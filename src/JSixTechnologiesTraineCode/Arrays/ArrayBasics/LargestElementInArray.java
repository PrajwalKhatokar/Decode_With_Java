package JSixTechnologiesTraineCode.Arrays.ArrayBasics;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n= sc.nextInt();
        int  arr[]= new int[n];
        // for input
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); // element we are inputing and storing in arr[i]
        }

        //logic

        int max=arr[0];
        for (int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

//output
//Enter the Size of the Array
//5
//enter the array elements
//10 30 90 70 14
//        90