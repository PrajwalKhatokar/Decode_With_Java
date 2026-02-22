package JSixTechnologiesTraineCode.BasicLoops;

import java.util.*;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("factorial of " +n+ " is " +fact);
    }
}
//Enter a Number
//5
//factorial of 5 is 120