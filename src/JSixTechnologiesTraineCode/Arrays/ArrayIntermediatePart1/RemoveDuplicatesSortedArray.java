package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart1;

import java.util.Scanner;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // for inputing
        System.out.println("Enter the array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // logic starts
        // 1 1 2 2 3 3 3
        int j=0;
        for(int i=1;i<n;i++){ // start from 1 because alreaedy 1st num is unique
            if(arr[i]!=arr[j]){// i and j values 1 and 1 adre ignore ntgh so != edhare do ur jobs
                j++;           // i got unique but already ond eruthe move front and then place unqiue val
                arr[j]=arr[i]; // placing new ele to j
            }
        }
            for(int i=0;i<=j;i++){ // <= j has now 1 2 3 it print simple
                System.out.print("" +arr[i]);
            }
    }
}