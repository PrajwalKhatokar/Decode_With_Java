package JSixTechnologiesTraineCode.Arrays.ArrayBasics;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n= sc.nextInt();
        int arr[]= new int[n];

        // for inputing
        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // logic start
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        double avg=(double) sum/n; // 5/2 i get 2 if int so double i used to get crt avg
        System.out.println("Sum " +sum);
        System.out.println("Average " +avg);
    }
}
//Enter the Size of the Array
//5
//Enter the array Elements
//10 20 30 40 50
//Sum 150
//Average 30.0