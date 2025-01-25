package String;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        int start=0;
        int end=str.length()-1;
        boolean pal = true;
        while(start<end){
            if (str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else {
                pal = false;
                break;

            }

        }
        if (pal == true){
            System.out.println("given String  is Palindrome");

        }
        else {
            System.out.println("given String is not a Palindrome");
        }
    }
}
