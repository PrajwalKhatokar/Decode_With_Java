package JSixTechnologiesTraineCode.BasicLoops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        //fibonaci series

//        0 1 1 2 3 5 8
        int a=0;
        int b=1;

        if(n>=1){  // ie when n=0 print 0 if n=2 both the if wil work not one rememeber
            // then 0 and 1 wil be printed
            System.out.print(a+" ");
        }

        if(n>=2){
            System.out.print(b+" ");
        }
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }
}

//Enter a Number
//8
//        0 1 1 2 3 5 8 13