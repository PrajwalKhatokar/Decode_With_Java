package JSixTechnologiesTraineCode.PatternPrintingPwskills.Triangle2;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int m=sc.nextInt();
        for (int i=1;i<=m;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
//enter a number
//4
//        1
//        1 2
//        1 2 3
//        1 2 3 4