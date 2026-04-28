package JSixTechnologiesTraineCode.Strings.Basicc;
import java.util.*;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();

                // store visited characters
                HashSet<Character> seen = new HashSet<>();  //Create memory to store unique characters
                                                             // “I will remember what I have already seen”
                                                             // seen = {}
                // build result
                StringBuilder result = new StringBuilder();  //Create empty box to build answer

                for (int i = 0; i < s.length(); i++) {

                    char curr = s.charAt(i);

                    // if not seen → add
                    if (!seen.contains(curr)) {  //“Have I NOT seen this before? inside my container” then add to seen
                        seen.add(curr);  // nodidre add to seen
                        result.append(curr); // nodidre add to result
                    }
                }

                System.out.println(result.toString());
            }
        }
//Banana
// Ban