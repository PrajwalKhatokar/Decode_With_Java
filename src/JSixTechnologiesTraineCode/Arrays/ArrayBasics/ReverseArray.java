package JSixTechnologiesTraineCode.Arrays.ArrayBasics;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        // for inputing
        System.out.println("enter the array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // logic starts we use two pointer method
        // 12345
        int left=0;
        int right=n-1;
        int temp=0;
        while(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//Enter the Size of an Array
//5
//enter the array elements
//1 2 3 4 5
//        5 4 3 2 1
//Process finished with exit code 0