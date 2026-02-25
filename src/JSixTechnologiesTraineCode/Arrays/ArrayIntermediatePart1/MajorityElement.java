package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart1;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
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

        //logic starts
        HashMap<Integer,Integer> map = new HashMap<>();//to store key and value pair

        for(int i=0;i<n;i++){

            // get old count or 0 if not present  ie map.getOrDefault(arr[i],0) returns current frequency of
            // element if present, otherwise returns 0.
            int count = map.getOrDefault(arr[i],0);

            // increase count
            count++;

            // store updated count
            map.put(arr[i],count); //updates frequency of element in HashMap, not array

            // check if majority
            if(count > n/2){
                System.out.println("Majority element: " + arr[i]);
                return;//This stops program immediately.Once majority found → stop checking further
                       // No need to check rest of array.Program exits from main().
                       // i can use break ? break only stops the loop, not the whole program.
            }
        }

        System.out.println("No majority element");
    }
}
//Enter the Size of the Array
//5
//Enter the array Elements
//1 1 1 2 3
//Majority element: 1