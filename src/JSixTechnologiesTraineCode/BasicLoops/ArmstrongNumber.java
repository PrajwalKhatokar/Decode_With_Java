package JSixTechnologiesTraineCode.BasicLoops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int org=n;
        int count=0;
        int temp=n;
        //lets find the total count once i get that i can cube ok na
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=n;
        int digit;
        int sum=0;
        // now Armstrong calculation
        while(temp>0){
            digit=temp%10;
            sum=sum+(int)Math.pow(digit,count);
            temp =temp/10;
        }
        if(org==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("not an ArmStrong number");
        }


    }
}

