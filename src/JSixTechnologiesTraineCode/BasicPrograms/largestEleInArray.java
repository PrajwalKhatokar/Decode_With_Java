package JSixTechnologiesTraineCode.BasicPrograms;

import java.util.Scanner;

public class largestEleInArray {
    public static void main(String[] args) {
        // arr=[10,20,90,50,60]
        System.out.println("enter the Size of the Array");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];

        //taking input from user

        for(int i=0;i<n;i++){
           arr[i] =sc.nextInt();
        }
        // making the first element as the largest element
        int max=arr[0];

        for(int i=1;i<n;i++){  // 1st element is assumed as the large as i start from 1
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("largest element in the Array is:"+max);


    }

}
//enter the Size of the Array
//5
//        10 20 90 70 30
//largest element in the Array is:90