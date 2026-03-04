package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InterSection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the 1ST  Array");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        // for inputing
        System.out.println("Enter the 1ST  Array elements");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the Size of the Array");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        // for inputing
        System.out.println("Enter the Array elements");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        //Intersection
        // 1 2 3 4
        // 2 3 4 5
        Set<Integer> s = new HashSet<>();
        Set<Integer> result= new HashSet<>();

        for (int i = 0; i < n1; i++) {
            s.add(arr1[i]);
        }

        for(int i=0;i<n2;i++){
            if(s.contains(arr2[i])){
                result.add(arr2[i]);
            }
        }
        System.out.println("intersection of two Arrays");
        for(int num:result){
            System.out.print(" "+num);
        }
    }
}

//
//Enter size of first array:
//        4
//Enter elements:
//        1 2 3 4
//Enter size of second array:
//        4
//Enter elements:
//        2 3 4 5
//Intersection:
//        2 3 4
//Process finished with exit code 0