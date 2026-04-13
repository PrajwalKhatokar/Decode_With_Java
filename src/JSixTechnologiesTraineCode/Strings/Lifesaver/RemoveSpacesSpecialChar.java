package JSixTechnologiesTraineCode.Strings.Lifesaver;

import java.util.Scanner;
import java.util .*;
public class RemoveSpacesSpecialChar {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {

                char curr = s.charAt(i);

                // 🔹 CASE 1: Letter or Digit → always keep
                if (Character.isLetterOrDigit(curr)) {
                    result.append(curr);
                }

                // 🔹 CASE 2: Space → allow only one
//               👉 curr == ' ' ->>“Earlier we were skipping spaces… now why checking for space?” 😵‍💫
                else if (curr == ' ' && result.length() > 0
                        && result.charAt(result.length() - 1) != ' ') {
                    result.append(' ');
                }

                    // meaning curr == ' ' ->Current character is SPACE
                    //result.length() > 0 -> Result is NOT empty
//                  result.charAt(result.length() - 1) != ' '  ->Last character in result is NOT space
//                    "I          love"
/**
                    AFTER 'I'
                    result = "I"
                    FIRST SPACE
                    curr = ' '
                    result.length() = 1 → TRUE
                            last = 'I' → not space → TRUE

                    👉 ADD space

                       result = "I "
//....................................................................................
                         SECOND SPACE
                         curr = ' '
                         result = "I "
                         last = ' ' → space

                         👉 condition fails ❌

                         👉 SKIP

                             THIRD SPACE

                             👉 same → SKIP

                             ALL REMAINING SPACES

                             👉 SKIP ❌

                             THEN 'l'
                             result = "I l"
                             🎯 FINAL OUTPUT
                             "I love"


                             🧠 FINAL SIMPLE MEANING

                             👉 Entire condition means:

                             “If current is space,
                             AND something already exists,
                             AND last thing is not space,
                             → then add ONE space”

                                 “I found a space,
                                 and I already have something,
                                 and last thing is not space,
                                 → so I will allow ONE space”

**/




                // 🔹 CASE 3: Special char → skip i dont write anything logic for that we skiping that
            }

            // 🔹 Remove trailing space
            if (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
                result.deleteCharAt(result.length() - 1);
            }

            System.out.println(result.toString());
        }
    }


//he@llo  wor!ld 123***
//hello world 123

