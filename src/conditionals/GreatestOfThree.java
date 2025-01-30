package conditionals;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // we are using nested if else ladder
        System.out.println("enter the first number");
        int a=sc.nextInt();

        System.out.println("enter the Second number");
        int b=sc.nextInt();

        System.out.println("enter the Third number");
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+ "is greatest");
            }
            else{
                System.out.println(c+ " is greatest");//because already i beaten a from b
            }
        }else{
            if(b>c){
                // if i came to b means i beaten a simple right
                System.out.println(b+ " is greatest");
            }else{
                System.out.println(c+ " is greatest");
            }
        }

    }
}
