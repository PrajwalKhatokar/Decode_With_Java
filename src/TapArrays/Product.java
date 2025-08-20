package TapArrays;

import java.util.Scanner;
public class Product {

    static int Prod(int arr[]) {
        int product = 1;//1 erbeku becuase im multiplying alwa so if 0 always i get 0 only
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        return product;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int total = Prod(arr);
        System.out.println("Product of the array elements are:" + total);

    }
}
//
//Output:
//enter the size of the array
//5
//1 2 3 4 5 6
//Product of the array elements are:120
