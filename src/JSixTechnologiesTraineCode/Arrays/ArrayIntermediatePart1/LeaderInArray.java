package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart1;

import java.util.Scanner;

public class LeaderInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        int arr[]= new int[n];
        // for inputing
        System.out.println("Enter the size of the Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        /// logic starts ie
        // 10 5 6 8 2
        // make lst ele 2 as MAxright and compare with Maxright
        int MaXRight = arr[n-1];
        System.out.print("Leaders: " + MaXRight + " "); // making last as maxright ,becuase last ele on his right no ele so he is always max
        for(int i=n-2;i>=0;i--){
            if(arr[i]>MaXRight){
                System.out.print(arr[i]+" ");
                MaXRight=arr[i]; // mele leader na printing whoever i get and update to next leaders
            }
        }
    }
}
//Enter the Size of the Array
//5
//Enter the size of the Array
//8 7 5 10 2
//Leaders: 2 10