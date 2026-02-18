package JSixTechnologiesTraineCode.BasicPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int digit=0;
        int rev=0;
        while(n>0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        if(org==rev){
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not a Palindrome number");
        }
    }
}

//enter a number
//1221
//palindrome number