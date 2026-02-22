package JSixTechnologiesTraineCode.Arrays.ArrayBasics;

import java.util.Scanner;

public class CheckSortedArray {
    //[ 50 30 10 60 90]
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
        // logic starts Sort an Array (means asc to desc Aste)
        // //[ 50 30 10 60 90] -> [ 10 30 50 60 90 ]
        // i dont need to sort only i need to check whether it is sorted or not impt
        //n= 5-> 0,1,2,3,4
        boolean sorted=true;
        for(int i=0;i<n-1;i++){//“Because I am comparing arr[i] with arr[i+1]. So I stop one step before last index to avoid array
                               // index out of bounds and still access next element safely.”
            if(arr[i]>arr[i+1]){ // ie if my curr ele is > than nxt ele say not sorted
                sorted=false; // immdetialy false and break and come out
                break;
            }
        }
        if(sorted){
            System.out.println("array is Sorted");
        }
        else{
            System.out.println(" array is not sorted");
        }
    }
}
 // output:

//Enter the Size of the Array
//5
//Enter the array Elements
//1 2 3 4 5
//array is Sorted