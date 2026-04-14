package JSixTechnologiesTraineCode.Strings.Lifesaver;
import java.util.*;
public class FirstNonRepeatingcharacter {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();

                HashMap<Character, Integer> map = new HashMap<>();
                // Character -> now to remember the character that we have visited
                // Integer -> to remember the frequency count

                // count frequency
                for (int i = 0; i < s.length(); i++) {

                    char curr = s.charAt(i);

                    // increase count
                    map.put(curr, map.getOrDefault(curr, 0) + 1);
                    //map.put(key,value)
                    //put value ila andre store maduthe and value edare update maduthe
                    //map.getOrDefault(Curr,0)+1, impt ok na memory nali value edia anta nodtine
                    // ilva 0 jothele 1 haki update ,direct 1 hakidre next time nali previous we will lose
                    // the frequency

                }

                // find first unique
                for (int i = 0; i < s.length(); i++) {

                    char curr = s.charAt(i);

                    if (map.get(curr) == 1) { // means na memory nali yavdh ondsala matra repeat hagide adhana print
                        System.out.println(curr);
                        return;  // ondh value sekidhtaskhna we are stopping ok na returning to jvm or else multiple value print maduthe
                    }
                }

                System.out.println("No unique character");
            }
        }

//noteees
/**

👉 “Why didn’t we use StringBuilder here?”

 🔥 SHORT ANSWER
Because we are NOT building a string ,means we are not do constructing
We are FINDING a character simple
**/

// output:

//swiss
// w  // first non repeating character