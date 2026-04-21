package JSixTechnologiesTraineCode.Strings.pwLeetcode;


import java.util.Arrays;

/**
 *
 * leeetcode solution rey sher aya sher
    class Solution {
        public boolean isAnagram(String s, String t) {

            if(s.length()!=t.length()) return false;
            char[] a = s.toCharArray();
            char[] b = t.toCharArray();


            Arrays.sort(a);
            Arrays.sort(b);

            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]) return false;
            }
            return true;
        }
 }
 **/

public class ValidAnagramNoHashmap {
public boolean isAnagram(String s, String t) {

    // Step 1: Length check
    if (s.length() != t.length())
        return false;

    // Step 2: Convert to char array
    char[] a = s.toCharArray();
    char[] b = t.toCharArray();

    // Step 3: Sort both arrays
    Arrays.sort(a); // import Arrays
    Arrays.sort(b);

    // Step 4: Compare characters
    for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i])
            return false;
    }

    return true;
}

    // Main method to test
    public static void main(String[] args) {

        ValidAnagramNoHashmap obj = new ValidAnagramNoHashmap();  // object create madde beacuse e isanagram static ala

        String s = "listen";
        String t = "silent";

        boolean result = obj.isAnagram(s, t);// calling with object cool tension yen beda bek adre ale static kodu object create mado nessity erodhila ok na

        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}

