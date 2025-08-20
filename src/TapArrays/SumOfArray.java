//1.Sum of all element in an array
package TapArrays;

import java.util.Scanner;

public class SumOfArray {

    static int Summation(int arr[]){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();

        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int total= Summation(arr);
        System.out.println("sum of the array elements are:" +total);

    }
}

//OutPUt

//enter the size of the array
//5
//10 20 30 40 50
//sum of the array elements are:150