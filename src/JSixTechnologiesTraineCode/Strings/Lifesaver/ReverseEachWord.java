package JSixTechnologiesTraineCode.Strings.Lifesaver;
import java.util.*;
public class ReverseEachWord {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            String[] words = s.split(" ");// split(" ")  -> I use split so that sentence becomes words
//            our target
//            pro tip:
//            "Split → Reverse → Join"

            //1. our target we are reversing the String by converting to word and removing spaces later
//            we add spaces ok na,impt reeverseing by word i edhare i hey reverse,here  position maintaing
//            avr avr places nali avre reverse hagbeku
//            2. we are only reversing the word ,we used split ie split(" ") spaces ede nodu " " ie cuting spaces
//          because it wil cut the spaces and string nali ero input na it  wil break into array
//           i love coding this is broken down into 3 words 1 word,love 1 word, coding 1 word
//            now total i love coding edhu length total 3

            String result = ""; // final answer na Store madake edh result ano variable

            for (int i = 0; i < words.length; i++) {

                String word = words[i]; //take one word from the array and store it in a variable
                String reversed = "";

                for (int j = word.length() - 1; j >= 0; j--) {
                    reversed = reversed + word.charAt(j);
                }

                result = result + reversed;

                if (i != words.length - 1) {  //If this is NOT the last word, then add a space
                    //Give me the current word so I can process i
                    /**👉 Instead of writing:

                    words[i].length()
                    words[i].charAt(j)

                  👉 Again and again ❌**/
                    // means last index ie 3 coding sekidre dont add spaces until that i adhmele coding adhmele space add madu
                    // which we removed earlier ok na
                    // means
//                         words = ["I", "love", "coding"]
//                         length = 3
//                         last index = 2
//                        👉 i != words.length - 1
//                        👉 Means:i is NOT last index
//                        🎯 FULL MEANING
//                        👉 So this line means:
//
//                          If current word is NOT the last word → add space
                    result = result + " ";
                }
            }

            System.out.println(result);
        }
    }

//i love u Prajwal B
//i evol u lawjarP B

//💻 FULL CODE WITH DEEP COMMENTS
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        // 🔹 Create Scanner object to take input from user
//        // 👉 Without this, we cannot read input from keyboard
//        Scanner sc = new Scanner(System.in);
//
//        // 🔹 Read full line (including spaces)
//        // 👉 Example input: "I love coding"
//        // 👉 Stored as ONE single string
//        String s = sc.nextLine();
//
//
//        // 🔹 Split the sentence into words using space as delimiter
//        // 👉 "I love coding" → ["I", "love", "coding"]
//        // 👉 Now we can process each word separately
//        // ❌ If we don't split → we have one big string → hard to handle words
//        String[] words = s.split(" ");
//
//
//        // 🔹 This will store final output
//        // 👉 Initially empty → we build result step by step
//        // ❌ If not created → we lose final answer
//        String result = "";
//
//
//        // 🔁 OUTER LOOP → runs for each word
//        // 👉 i = index of word
//        // 👉 Controls WHICH word we are processing
//        // 👉 words.length = total number of words
//        for (int i = 0; i < words.length; i++) {
//
//            // 🔹 Pick current word from array
//            // 👉 Example: i = 1 → word = "love"
//            // 👉 CPU: "This is the word I will reverse now"
//            String word = words[i];
//
//
//            // 🔹 Empty string to store reversed version of current word
//            // 👉 We build reversed word character by character
//            // ❌ If not used → we overwrite or lose reversed data
//            String reversed = "";
//
//
//            // 🔁 INNER LOOP → reverse characters of current word
//            // 👉 Start from LAST index → move to FIRST index
//            // 👉 word.length() - 1 = last index
//            // 👉 j >= 0 → until first character
//            for (int j = word.length() - 1; j >= 0; j--) {
//
//                // 🔹 Pick character from end and add to reversed string
//                // 👉 Example: "love"
//                //    j=3 → 'e' → reversed="e"
//                //    j=2 → 'v' → reversed="ev"
//                //    j=1 → 'o' → reversed="evo"
//                //    j=0 → 'l' → reversed="evol"
//
//                // ❌ If we loop forward (0 → end), no reversal happens
//                // ❌ If we skip this line → nothing gets reversed
//                reversed = reversed + word.charAt(j);
//            }
//
//
//            // 🔹 Add reversed word to final result
//            // 👉 Example:
//            //    result = "I " + "evol" → "I evol"
//            // ❌ If not added → reversed word is lost
//            result = result + reversed;
//
//
//            // 🔹 Add space ONLY if this is NOT the last word
//            // 👉 words.length - 1 = last index
//            // 👉 i != last index → not last word → add space
//
//            // 🎯 WHY?
//            // 👉 To avoid extra space at end
//            // ❌ Without this → "I evol gnidoc " (extra space ❌)
//
//            if (i != words.length - 1) {
//                result = result + " ";
//            }
//        }
//
//
//        // 🔹 Print final result
//        // 👉 Output: "I evol gnidoc"
//        // ❌ If not printed → no output visible
//        System.out.println(result);
//    }
//}
//🧠 FINAL CPU FLOW (STORE THIS 🔥)
//INPUT:
//        "I love coding"
//
//        ↓ split
//["I", "love", "coding"]
//
//        ↓ outer loop (word by word)
//"I" → inner loop → "I"
//        "love" → inner loop → "evol"
//        "coding" → inner loop → "gnidoc"
//
//        ↓ join with space control
//"I evol gnidoc"
//        🎯 ULTRA MEMORY VERSION
//
//👉
//
//Split → Outer loop (words) → Inner loop (reverse) → Add → Space control → Print