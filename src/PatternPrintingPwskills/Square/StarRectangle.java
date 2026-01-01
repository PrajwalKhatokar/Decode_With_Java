package PatternPrintingPwskills.Square;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows and column");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for (int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Output:

//enter the rows and column
//4 5
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *