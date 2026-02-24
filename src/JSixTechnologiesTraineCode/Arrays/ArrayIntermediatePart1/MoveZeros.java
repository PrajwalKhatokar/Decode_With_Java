package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart1;

import java.util.Scanner;

public class MoveZeros {
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
        // logic Starts
        //[ 0,4,0,2,1]
        //using two pointer
        //i wil be at0th index, i will traverse each array,i ignore 0 ,if i get non zero tel j
        // j wil be at oth index, if i get non zero from i swap with j, put that in j position and j move forward.

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){ // 0 sekidre ignore ,not equal edhare swap simple
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;

            }
        }
        for(int num:arr){
            System.out.print(" " +num);
        }

    }
}

//Enter the Size of the Array
//5
//Enter the array Elements
//0 9 7 0 6
/// 9 7 6 0 0
