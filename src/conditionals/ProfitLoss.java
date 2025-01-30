package conditionals;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price");
        int cp=sc.nextInt();
        System.out.println("enter the Selling price");
        int sp=sc.nextInt();
        if(sp>cp){
            System.out.print("profit is");
            System.out.println(sp-cp); //showing how much profited
        } else if (cp==sp) {
            System.out.println("no profit no loss");
        }
        else{
            System.out.print("loss is ");
            System.out.println(cp-sp);
        }
    }
}
