package PatternPrintingPwskills.SpecialPatternPartOne;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }
    }
}
//enter a number
//     4
//        1
//        1 3
//        1 3 5
//        1 3 5 7
