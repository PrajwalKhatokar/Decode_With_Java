package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the first Array");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        // input the array
        System.out.println("enter the array1 elements");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the Size of the Second Array");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        // input the array
        System.out.println("enter the array1 elements");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }


        //logic starts ie union
        // i nned to have 2 array
        // 1 2 3 4
        // 2 3 4 5
        // final i get -> 1 2 3 4 5
        // unique beku so we use set
        // set is interface ,edhake implementaion ge use class wwe use here
        // hashset ,it help to store the element
        // and orderness segala ,if i need ordernes then go for the linkedhashset

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }

        for(int i=0;i<n2;i++){
            set.add(arr2[i]);
        }

        System.out.println("union");

        for (int num:set) {
            System.out.print(num + " ");
        }
    }
}
//Output:
//
//Enter the Size of the first Array
//4
//enter the array1 elements
//1 2 3 4
//Enter the Size of the Second Array
//4
//enter the array1 elements
//2 3 4 5
//union
//1 2 3 4 5
//Process finished with exit code 0

