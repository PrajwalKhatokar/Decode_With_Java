package TapArrays.SumOfNMinusOne;

import java.util.Scanner;

public class launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] arr= new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int total= Operations.Summation(arr);
        long big=Operations.maximo(arr);

        long least=Operations.minimum(arr);

        System.out.println("maxmimum element in the sum n-1 is:" +(total-big));
        System.out.println("minimum element in the sum n-1 is:" +(total-least));
    }
}

//output:

//enter the size of the array
//5
// 3 1 2 4 5
//maxmimum element in the sum n-1 is:10
//minimum element in the sum n-1 is:14
