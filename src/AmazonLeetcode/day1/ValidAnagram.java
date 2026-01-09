package AmazonLeetcode.day1;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

    }
    class Solution {

        public boolean isAnagram(String s, String t) {

        /*
        =========================================================
        STEP 0: PROBLEM UNDERSTANDING
        ---------------------------------------------------------
        We are given two strings s and t.
        We must check whether t is an anagram of s.

        Anagram definition:
        - Same characters
        - Same frequency of each character
        - Order does NOT matter
        =========================================================
        */

        /*
        =========================================================
        STEP 1: LENGTH CHECK (EARLY EXIT)
        ---------------------------------------------------------
        If lengths are not equal, they can NEVER be anagrams.
        Why?
        - Anagram must use all characters exactly once
        - Different lengths means extra or missing characters
        =========================================================
        */
            if (s.length() != t.length()) {
                return false;
            }

        /*
        =========================================================
        STEP 2: CREATE FREQUENCY MEMORY
        ---------------------------------------------------------
        HashMap<Character, Integer>

        WHY HashMap?
        - We need to store FREQUENCY (count)
        - HashSet is NOT enough because it only stores presence

        KEY   = character (e.g., 'a')
        VALUE = how many times it appears (e.g., 3)
        =========================================================
        */
            HashMap<Character, Integer> map = new HashMap<>();

        /*
        =========================================================
        STEP 3: FIRST LOOP — BUILD FREQUENCY INVENTORY FROM s
        ---------------------------------------------------------
        We iterate over string s.
        For each character:
        - If character already exists in map → increase count
        - If not exists → start count from 1

        getOrDefault(c, 0) means:
        - If key exists → give its value
        - If key does NOT exist → give 0
        =========================================================
        */
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                // If c already exists, increase count
                // If not, default is 0, so 0 + 1 = 1
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

        /*
        After this loop, map represents EXACT frequency of s.
        Example: s = "anagram"
        map = { a=3, n=1, g=1, r=1, m=1 }
        */

        /*
        =========================================================
        STEP 4: SECOND LOOP — CONSUME INVENTORY USING t
        ---------------------------------------------------------
        Now we iterate over string t.
        Each character in t must:
        1) Exist in the map (character existed in s)
        2) Have frequency > 0 (not overused)

        This loop REDUCES counts from the map.
        Think of map as INVENTORY.
        =========================================================
        */
            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);

            /*
            FAILURE CONDITION CHECK (VERY IMPORTANT):

            !map.containsKey(c)
            → character never existed in s

            map.get(c) == 0
            → character existed but already fully used

            If ANY of these is true → NOT an anagram
            */
                if (!map.containsKey(c) || map.get(c) == 0) {
                    return false;
                }

            /*
            If character is valid:
            - Reduce its frequency by 1
            - This means we matched one occurrence
            */
                map.put(c, map.get(c) - 1);
            }

        /*
        =========================================================
        STEP 5: FINAL RETURN
        ---------------------------------------------------------
        If we reached here:
        - All characters in t successfully consumed
        - No missing characters
        - No extra characters

        Therefore, s and t are ANAGRAMS.
        =========================================================
        */
            return true;
        }
    }

/*
=========================================================
MENTAL MODEL (LOCK THIS IN MEMORY)
---------------------------------------------------------
1) First loop BUILDS frequency inventory from s
2) Second loop CONSUMES inventory using t
3) If inventory runs out or character missing → false
4) If all consumed cleanly → true

This is O(n) time and O(1) space.
=========================================================
*/
}
