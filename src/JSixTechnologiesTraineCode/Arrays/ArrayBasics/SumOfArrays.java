package JSixTechnologiesTraineCode.Arrays.ArrayBasics;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args){
        System.out.println("enter the Size of the Array");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr = new int[n];

        // now traversing
        System.out.println("enter the Array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //logic starts
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of the Array is "+sum);
    }
}

//output
//
//enter the Size of the Array
//4
//enter the Array elements
//100 200 150 50
//Sum of the Array is 500