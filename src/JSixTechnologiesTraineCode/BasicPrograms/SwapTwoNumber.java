package JSixTechnologiesTraineCode.BasicPrograms;
import java.util.*;
public class SwapTwoNumber {
    public static void main(String[] args) {
//        //using temp variable we do swaping ok na.
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter first number");
//        int a=sc.nextInt();
//        System.out.println("Enter Second number");
//        int b=sc.nextInt();
//        int temp=0;
//
//        temp=a;
//        a=b;
//        b=temp;
//
//        System.out.println("after Swapping");
//
//        System.out.println(a);
//        System.out.println(b);


        // now without using the temp variable now..

//        using temp variable we do swaping ok na.
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();
        int temp=0;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after Swapping");

        System.out.println(a);
        System.out.println(b);
    }
}
