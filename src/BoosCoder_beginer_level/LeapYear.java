package BoosCoder_beginer_level;

public class LeapYear {
    public static void main(String[] args) {

    }

// User function Template for Java

    // code here
    // order matters eli
// 🧠 Why this works for 2200
// Check	Result
// %400	❌
// %100	✅ → immediately false
// %4	❌ (never reached)

// ✔ Correctly returns false

//            🔹 Leap Year Rules (Important Concept)
//
//            A year is a Leap Year if:
//
//            1️⃣ Year is divisible by 400 → ✅ Leap year
//            2️⃣ Year is divisible by 100 but NOT 400 → ❌ Not leap year
//            3️⃣ Year is divisible by 4 but NOT 100 → ✅ Leap year
//            4️⃣ Otherwise → ❌ Not leap year
//
//   Specific → General Hierarchy Here

//   400 → Most strict rule
//   100 → Medium rule
//   4 → General rule
//
//🔥 Real Life Analogy
//
//   Imagine college admission rules:
//
//1️⃣ Rank < 10 → Direct admission
//2️⃣ Rank < 100 → Merit admission
//3️⃣ Rank < 500 → Waiting list
//
//    If you check Rank < 500 first:
//
//            👉 Every student gets waiting list
//👉 Top rank students never reach direct admission
//
//    Same concept here.
//
//🔥 Visual Flow (Mental Diagram)
//    Start
//   ↓
//    Divisible by 400 ?
//            ↓Yes → Leap Year
//   ↓No
//    Divisible by 100 ?
//            ↓Yes → Not Leap
//   ↓No
//    Divisible by 4 ?
//            ↓Yes → Leap
//   ↓No → Not Leap

    class Solution {
        static boolean isLeap(int N) {


            if (N % 400 == 0) {
                return true;
            }
            else if (N % 100 == 0) {
                return false;
            }
            else if (N % 4 == 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }


}
