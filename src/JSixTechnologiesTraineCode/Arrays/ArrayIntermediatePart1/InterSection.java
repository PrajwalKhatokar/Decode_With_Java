package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InterSection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter elements:");
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }

        System.out.println("Intersection:");

        for(int num : result){
            System.out.print(num + " ");
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