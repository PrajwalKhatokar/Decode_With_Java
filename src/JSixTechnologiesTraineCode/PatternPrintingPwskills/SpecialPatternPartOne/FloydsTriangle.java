package JSixTechnologiesTraineCode.PatternPrintingPwskills.SpecialPatternPartOne;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int k=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=i; j++) {

                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
//enter a number
//4
//        1
//        2 3
//        4 5 6
//        7 8 9 10
