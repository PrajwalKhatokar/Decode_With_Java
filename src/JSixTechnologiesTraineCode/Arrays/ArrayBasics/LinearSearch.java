package JSixTechnologiesTraineCode.Arrays.ArrayBasics;

import java.util.Scanner;

public class LinearSearch {
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

        System.out.println("Enter the Search Element");
        int key=sc.nextInt();
        //linear Search Logic Start here
        // [10 ,30,60,80 .90] linear search it should be sorted first
        boolean linear=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("element found at the index "+i);
                linear=true;
                break;
            }
        }
        if(!linear){
            System.out.println("element not found");
        }
    }
}
//Enter the Size of the Array
//5
//Enter the array Elements
//10 30 80 90 40
//Enter the Search Element
//80
//element found at the index 2