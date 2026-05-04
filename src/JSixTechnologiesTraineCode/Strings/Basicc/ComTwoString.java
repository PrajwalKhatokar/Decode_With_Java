package JSixTechnologiesTraineCode.Strings.Basicc;

import java.util.Scanner;

public class ComTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        if(s1==s2){
            System.out.println("using == : same reference");
        }
        else {
            System.out.println("using == : different reference ");
        }

        if(s1.equals(s2)){
            System.out.println("using equals :  same content");
        }
        else{
            System.out.println("using equals :  different content");
        }
    }
}
/*
String a = "java";
String b = "java";

System.out.println(a == b);        // TRUE (SCP reuse)
System.out.println(a.equals(b));   // TRUE


🟢 WHEN WILL IT BE TRUE?

Only in these cases 👇

✅ CASE 1: SAME REFERENCE (ASSIGNMENT)
String s1 = sc.nextLine();
String s2 = s1;

👉 Now:

s1 and s2 → same object ✔

👉 Output:

same reference ✅
✅ CASE 2: USING intern()
String s1 = sc.nextLine().intern();
String s2 = sc.nextLine().intern();

👉 Input:

java
java

👉 Now:

Both point to SCP

👉 Output:

same reference ✅
❌ YOUR CURRENT CODE
String s1 = sc.nextLine();
String s2 = sc.nextLine();

👉 Always:

different reference ❌
🎯 FINAL MEMORY LOCK
Scanner → always heap → new object ❌
intern() → SCP → shared ✔
🧠 ULTRA SIMPLE LINE
Same input ≠ Same object


🟢 WHEN WILL IT BE TRUE?

Only in these cases 👇

✅ CASE 1: SAME REFERENCE (ASSIGNMENT)
String s1 = sc.nextLine();
String s2 = s1;

👉 Now:

s1 and s2 → same object ✔

👉 Output:

same reference ✅
✅ CASE 2: USING intern()
String s1 = sc.nextLine().intern();
String s2 = sc.nextLine().intern();

👉 Input:

java
java

👉 Now:

Both point to SCP

👉 Output:

same reference ✅
❌ YOUR CURRENT CODE
String s1 = sc.nextLine();
String s2 = sc.nextLine();

👉 Always:

different reference ❌
🎯 FINAL MEMORY LOCK
Scanner → always heap → new object ❌
intern() → SCP → shared ✔
🧠 ULTRA SIMPLE LINE
Same input ≠ Same object
 */