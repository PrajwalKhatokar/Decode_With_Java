package Ashok_it_String;
//remove vowel from string
//input : hello, i love my india
//output : hll , lv my   nd
public class StringRemoveVowels {
    public static void main(String[] args) {
        String s="hello, i love my india";

        s=s.replaceAll("[aeiouAEIOU]","");// i need to put in [] t
        // means pattern find and replace with the empty string
        System.out.println(s);
    }
}
