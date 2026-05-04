package JSixTechnologiesTraineCode.Strings.Basicc;

import java.util.Scanner;

public class StringexistsInSecondString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        if (s2.contains(s1)) { // checking s1 is present in the s2
            System.out.println("s1 is present in s2");
        }else{
            System.out.println("s1 is not present in s2");
        }
    }
}
//output:

//java
//i love java but not placed
//s1 is present in s2



 /*
 *👉 Check if first string exists inside second string

s1 = "love"
s2 = "I love coding"
→ Output: TRUE
🧠 1️⃣ ABSOLUTE SCRATCH (REAL SCENARIO)

👉 Think:

You search a word inside a sentence (like Ctrl+F)

Question:

“Is s1 present anywhere inside s2?”
 2️⃣ WHY THIS LOGIC

We must:

Compare s1 with every possible position in s2
❌ Wrong thinking
Direct == comparison ❌

Because:

"love" != "I love coding"
✅ Correct thinking
Slide s1 over s2 and check match
  */