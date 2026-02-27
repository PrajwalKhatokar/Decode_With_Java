package JSixTechnologiesTraineCode.BasicPrograms;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int digit=0;

        // logic simliar to reverse a number there -> rev=rev*10+digit;
        while(n>0){
            digit=n%10;
            sum=sum+digit; // here
            n=n/10;
        }
        System.out.println(sum);

    }
}
//enter a number
//123456  // 1+2+3+4+5+6
//21