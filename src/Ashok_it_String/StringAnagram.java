package Ashok_it_String;

import java.util.Arrays;

// write a program to check whether given two string are anagram
public class StringAnagram {
    public static void main(String[] args) {
        String s1="keep";
        String s2="peek";

        // first check the length,if not equal then return madu
        if(s1.length()!=s2.length()) {
            System.out.println("given String are not anagrams");
            return;
        }
            // if akasmath en adru length equal adre
            //now to modify the string convert to toCharArray() 1st
            // sort and then check their values are same using .equals, so check
            //to check .equals i work only on the sorted array only.

            char c1[]=s1.toCharArray();

            char c2[]=s2.toCharArray();


            Arrays.sort(c1);
            Arrays.sort(c2);

            boolean flag=Arrays.equals(c1,c2);

            if(flag) { // i know this condtion work if it is true ok na
                System.out.println("Anagram");
            }else {
                System.out.println("not an Anagram");

        }
    }
}
