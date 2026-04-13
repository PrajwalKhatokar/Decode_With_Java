package JSixTechnologiesTraineCode.Strings.Lifesaver;

import java.util.*;

public class RemoveExtraSpace {
//    i this ide only i try my best to explain ok na
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    StringBuilder result = new StringBuilder(); // Better than String because it avoids creating new objects repeatedly
        for (int i = 0; i < s.length(); i++) {  // means stil wat i entered the string alivargu

        char curr = s.charAt(i); // character by character reading and storing in the curr ok na

        if (curr != ' ') {   // if my curent char spaces edare skip
                             // amele i en adru bandre add madu adhna ie result nali store madu
            result.append(curr);
        } else if (result.length() > 0 && result.charAt(result.length() - 1) != ' ') {
            result.append(' ');
            // i aithu mathe space banthu ok na
            // now result length yenu i andre 1 ,1>0 ok nice && ega space ila andre matra space madu antai adhmele i onne space
            // next i space l banthu ie
            // i l
            // now cond 1 ge oguthe cur is not space i have i ok na
            // add to result now result has i l
            // same edha tara continue
        }
    }

        if (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
        result.deleteCharAt(result.length() - 1);

        // edhu yenu ila simple hey

//            i love coding last coding adhmele space edhare adhna remove madake aste ne logic arta madkobeku dont baihart
    }

        System.out.println(result.toString()); // Stringbuilder nali we used result na it is object but
//        //i need String so we did toString converted builder to String
      /**
        Without .toString()
        Java does conversion automatically
       👉  Hidden behavior
       With .toString()
       You explicitly convert → clear understanding
       **/
}
}

//output

//    i       love      coding
//i love coding

// detailed explnation
//...........................................................................................................
/**import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 🔹 Step 0: Take input from user
        // 👉 Example input: "  I   love   coding  "
        // 👉 Stored as ONE string (with spaces included)
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        // 🔹 Step 1: Create result container
        // 👉 StringBuilder is used to build output step by step
        // 👉 Better than String because it avoids creating new objects repeatedly
        StringBuilder result = new StringBuilder();

        // 👉 Initially:
        // result = ""
        // (empty string)


        // 🔁 Step 2: Traverse each character of input string
        // 👉 i = index of current character
        // 👉 CPU: "I will scan left → right one character at a time"
        for (int i = 0; i < s.length(); i++) {

            // 🔹 Step 3: Get current character
            char curr = s.charAt(i);

            // =========================================================
            // 🔥 CASE 1: Current character is NOT space
            // =========================================================
            if (curr != ' ') {

                // 👉 Always add letters / numbers / symbols
                // 👉 Example:
                // result = "I lov"
                // curr = 'e'
                // → result = "I love"

                result.append(curr);

                // ❌ If we don't do this:
                // 👉 All characters will be skipped
                // 👉 Output becomes empty ❌
            }

            // =========================================================
            // 🔥 CASE 2: Current character is SPACE
            // =========================================================
            else if (

                // 👉 CONDITION 1:
                // Check if result is NOT empty
                // WHY?
                // 👉 To avoid adding space at beginning (leading space)
                    result.length() > 0

                            &&

                            // 👉 CONDITION 2:
                            // Check last character of result
                            // result.length() - 1 → last index
                            // charAt(...) → last character
                            result.charAt(result.length() - 1) != ' '
            ) {

                // 👉 Only ONE space is allowed
                // 👉 Example:
                // "I   love" → "I love"

                result.append(' ');

                // ❌ If we remove CONDITION 1:
                // 👉 Output: " I love" (leading space ❌)

                // ❌ If we remove CONDITION 2:
                // 👉 Output: "I     love" (multiple spaces ❌)
            }
        }


        // =========================================================
        // 🔥 FINAL STEP: REMOVE TRAILING SPACE
        // =========================================================

        // 👉 Sometimes last character becomes space
        // Example: "I love coding "
        //                          ↑ extra space

        if (

            // 👉 Check result is not empty (safety)
                result.length() > 0

                        &&

                        // 👉 Check last character is space
                        result.charAt(result.length() - 1) == ' '
        ) {

            // 👉 Remove last character
            result.deleteCharAt(result.length() - 1);

            // 👉 After removal:
            // "I love coding"

            // ❌ If we don't do this:
            // 👉 Output: "I love coding " (extra space ❌)
        }


        // 🔹 Step 5: Print final cleaned string
        System.out.println(result.toString());
    }
}

*/