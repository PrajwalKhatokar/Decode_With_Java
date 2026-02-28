package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart1;

import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // for inputing
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //logic starts
        // left rotate
        // 0 1 2 3 4 ::: last ele erala ie ina till index 3 so < n-1 :: 5-1=4 ie < 4 means 3 vargu
        // 1 2 3 4 5
        // 2 3 4 5 _
        //final 2 3 4 5 1

        int temp=arr[0];
        for(int i=0;i<n-1;i++) {
            arr[i] = arr[i + 1];
        }
        arr[n-1]=temp;

        System.out.println("after Left Rotate");
        for(int num: arr){
            System.out.print(" "+num);
        }
    }
}
//Enter the Size of the Array
//5
//Enter Array Elements
//1 2 3 4 5
//after Left Rotate
// 2 3 4 5 1
//Process finished with exit code 0
