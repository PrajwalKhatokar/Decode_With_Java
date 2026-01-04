package PatternPrintingPwskills.Square;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int m=sc.nextInt();
        for (int i=1;i<m;i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//
//Output:
//enter a number
//4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4


