package PatternPrintingPwskills.Square;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sides for square");
        int m=sc.nextInt();
        for (int i=0;i<m;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Output:
//enter the sides for square
//7
//        * * * * * * *
//        * * * * * * *
//        * * * * * * *
//        * * * * * * *
//        * * * * * * *
//        * * * * * * *
//        * * * * * * *