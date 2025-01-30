package conditionals;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //absolute number means make +Ve no as +ve and -ve as +ve
        if(n<0){
            System.out.println(-n);
        }
        else {
            System.out.println(n);
        }
    }
}
