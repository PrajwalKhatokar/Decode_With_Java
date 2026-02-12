package JSixTechnologiesTraineCode;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        // madam

        int left=0;
        int right=s.length()-1;
        boolean isPalindrome=true;
        while(left<right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
                left++;
                right--;

        }
            if(isPalindrome){
                System.out.println("Palindome String");
            }
            else{
                System.out.println("not Palindrome String");
            }
        }
    }

