package conditionals;

import java.util.Scanner;

public class Validtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        int a = sc.nextInt();

        System.out.println("enter the Second number");
        int b = sc.nextInt();

        System.out.println("enter the Third number");
        int c = sc.nextInt();

        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            System.out.println("valid triangle");
        } else {
            System.out.println("invlaid triangle");
        }
    }
}
