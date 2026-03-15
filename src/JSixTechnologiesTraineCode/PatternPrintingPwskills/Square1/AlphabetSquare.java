package JSixTechnologiesTraineCode.PatternPrintingPwskills.Square1;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int m=sc.nextInt();
        for (int i=1;i<=m;i++) {
            for (int j = 1; j <=m; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
//Output:

//enter a number
//4
//A B C D
//A B C D
//A B C D
//A B C D
