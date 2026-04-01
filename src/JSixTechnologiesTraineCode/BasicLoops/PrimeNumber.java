package JSixTechnologiesTraineCode.BasicLoops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        boolean isprime=true;
        if(n<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime Number");
        }
    }
}



/*

🔴 Why 0 is NOT prime?
👉 0 has infinite divisors

 1 is not a prime number because it has only one factor (1), but a prime number must have exactly two factors (1 and itself)


*/