package JSixTechnologiesTraineCode.PatternPrintingPwskills.Triangle2;
import java.util.Scanner;

public class HomeWorkSeventh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int m=sc.nextInt();
        for (int i=1;i<=m;i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2!=0) {
                    System.out.print(j + " ");
                }
                else{
                    System.out.print((char)(j+64)+" ");
                }
            }
            System.out.println();
        }
    }
}

//enter a number
//
//5
// 1
//A B
//1 2 3
//A B C D
//1 2 3 4 5
// A B c D E F