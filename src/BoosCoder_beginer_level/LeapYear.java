package BoosCoder_beginer_level;

public class LeapYear {
    public static void main(String[] args) {

    }

// User function Template for Java

    class Solution {
        static boolean isLeap(int N) {
            // code here
            // order matters eli
// 🧠 Why this works for 2200
// Check	Result
// %400	❌
// %100	✅ → immediately false
// %4	❌ (never reached)

// ✔ Correctly returns false


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
