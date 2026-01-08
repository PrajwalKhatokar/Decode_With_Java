package AmazonLeetcode.day1;

import java.util.HashSet;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {

    }
    class Solution {
        public int lengthOfLongestSubstring(String s) {
//lets create a memory for no duplicate logic
            HashSet<Character> set=new HashSet<>();
            // Input: s = "abcabcbb"
            // Output: 3

            // fINAL SHOT
            //we will use two pointer ok
            //right for traverse and left for if duplicate if i get shrink that until we remove that so we keep the left inside the while loop.
            // i nned to return the maximum length of the array after duplicates has been removed
            int left=0;
            int maxlength=0;
            for(int right=0;right<s.length();right++){
                char current=s.charAt(right);//one one character im taking and puting in current variable so that so check that present in our left
                while(set.contains(current)){
                    // im checking in 1st eteration
                    //whether 'a' is present in set  if yes remove from left if
                    //no add that i used while loop becuase it need to remove the
                    //duplicate it may present at any postion
                    set.remove(s.charAt(left));
                    // we are removing al  left chacater util
                    // duplicate
                    // removed(but duplicate removing aste maximum legth seguthe)
                    // core heaart logic
                    left++;// after removing go front
                }
                set.add(current);// if not there in set add ok
                maxlength=Math.max(maxlength,right-left+1);// right-left+1
                // intial rigth and left 0 ok if i has one character then 1 i
                // get so i used + 1 or else i wil be having character but
                // stil 0
            }
            return maxlength;// returning maximum length here ok
        }
    }
}
