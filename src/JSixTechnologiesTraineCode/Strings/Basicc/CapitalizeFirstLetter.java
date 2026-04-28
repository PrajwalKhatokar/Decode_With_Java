package JSixTechnologiesTraineCode.Strings.Basicc;
import java.util.*;
public class CapitalizeFirstLetter {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            StringBuilder result = new StringBuilder();//Create empty box to build answer
//            String Once created → cannot be changed
//            StringBuilder is used because String is IMMUTABLE
//            Using String
//            Step 1: ""
//            Step 2: "J"
//            Step 3: "Ja"
//            Step 4: "Jav"
//            Step 5: "Java"
//
//👉 Each step = new object created ❌



            for (int i = 0; i < s.length(); i++) {

                char curr = s.charAt(i);

                // first character OR after space
                if (i == 0 || s.charAt(i - 1) == ' ') {    //“If first character OR start of new word”
//                    i==0 -> “Am I at the first character?”
//                    s.charAt(i - 1) == ' ' -->“Is previous character a space?”//
                    // boom etara arta madko ero character nali adru last word spaces edhare kill to captialize

                    // ega arta haguthe odhu first character na captilize madu and also space adhmele next word na
                    // captialize madu

                    result.append(Character.toUpperCase(curr)); //Convert to uppercase
                } else {
                    result.append(curr);  // bere yela normal hagi append madu
                }
            }

            System.out.println(result.toString());
//   WHY toString()
//👉 result is: StringBuilder object
//👉 toString() converts it into: String
        }
    }

//java full stack developer
//Java Full Stack Developer



