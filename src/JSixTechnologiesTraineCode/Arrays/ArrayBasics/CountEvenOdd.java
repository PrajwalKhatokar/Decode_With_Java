package JSixTechnologiesTraineCode.Arrays.ArrayBasics;

import java.util.Scanner;

public class CountEvenOdd {
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
       int evencount=0;
        int oddcount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0 ){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Even "+evencount );
        System.out.println("Odd "+oddcount);
}
}

//Enter the Size of the Array
//5
//Enter the array Elements
//1 8 9 4 6
//Even 3
//Odd 2