package JSixTechnologiesTraineCode;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int digit=0;
        int rev=0;
        while(n>0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("reverse digit is:" +rev);
    }

}
