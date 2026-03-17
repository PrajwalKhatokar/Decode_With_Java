package JSixTechnologiesTraineCode.Arrays.TwoDArrays.Basic;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // i bet i have beautifully explained...
        // full neat hagi with comments I'm explaning ok na u should not get doubt in entire life
        //lets do with user input,in the next example we see hardcoding direct we give the array ok

        System.out.println("enter the row size");
        int m = sc.nextInt();
        System.out.println("enter the colummn size");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        //lets take elements na input
        System.out.println("Enter the rows and column  elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
            //traversing ok
            System.out.println("rows and columns are:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");// side by side printing element
                }
                System.out.println();//after printing 1 2 nextline and print 3 4
            }
        }
    }
//enter the row size
//4
//enter the colummn size
//2
//Enter the rows and column  elements
//1 50
//        2 90
//        3 70
//        4 30
//rows and columns are:
//        1 50
//        2 90
//        3 70
//        4 30
