package AmazonLeetcode.BasicMust.level1;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {

    }
}


    class Solution {
        public int countDigits(int num) {

            // Special case: if number is 0, it has exactly one digit
            if (num == 0) {
                return 1;
            }

            // Handle negative numbers
            num = Math.abs(num);

            int count = 0;

            // Keep removing last digit until number becomes 0
            while (num != 0) {
                num = num / 10;  // removes one digit
                count++;         // count that digit
            }

            return count;
        }
    }
