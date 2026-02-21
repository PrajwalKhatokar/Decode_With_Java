package JSixTechnologiesTraineCode.BasicLoops;

import java.util.Scanner;

public class Countdigit {
    public static void main(String[] args) {
         // our task is count digit
        // case 1: if n=0 then total digit is 0
        // 1234 -> 4 digit
    Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
    int n=sc.nextInt();
    int count=0;
    if(n==0){
        count=1;
    }
    else{
        while(n>0){
            n=n/10; // means ondonde last digit remove madu count++ madu
            count++;
        }
    }
        System.out.println(count);
    }
}
// output:
//enter a number
//1234
//4