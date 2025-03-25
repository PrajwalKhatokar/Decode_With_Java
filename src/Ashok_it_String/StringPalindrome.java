package Ashok_it_String;

// write a java program to find the palindrome.
public class StringPalindrome {
    public static void main(String[] args) {
        String str = "liril";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        if (str.equals(rev)) {//orginal and reverse string value are we are comparing
            System.out.println("palindrome");
        } else {
            System.out.println("not an palindrome");
        }
    }
}
