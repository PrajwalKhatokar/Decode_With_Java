package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart1;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n= sc.nextInt();
        int arr[]= new int[n-1];

        // for inputing
        System.out.println("Enter the array Elements");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        // missing number in an array
        // n=5
        // 1 2 3 4 one missing so array size ondh kami n-1
        //eexpected sum- actual sum = missing number
        int expected_sum = n*(n+1)/2; // sum of natural num formula
        int acutal_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            acutal_sum=acutal_sum+arr[i];
        }
        System.out.println("missing Number is: " +(expected_sum-acutal_sum));
    }
}
//Enter the Size of the Array
//5
//Enter the array Elements
//1 3 4 5
//missing Number is: 2

//Enter the Size of the Array
//9
//Enter the array Elements
//1 2 3 4 5 6 7 9
//missing Number is: 8