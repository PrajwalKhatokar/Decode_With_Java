package loop;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int ld;
        while (n != 0) {
            ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }
        System.out.println(sum);
    }
}

