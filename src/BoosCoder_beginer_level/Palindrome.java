package BoosCoder_beginer_level;

public class Palindrome {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isPalindrome(int x) {
            // first reverse the number
            // reverse number check with the orginal  number ok
            int original=x;
            int rem =0;
            int temp=0;

            // base condition
            while(x>0){
                rem=x%10;
                temp=temp*10+rem;
                x=x/10;  // finaly x i get 0 after 4 iterations
            }

            return (original==temp);  //x==temp no because meele nodu im modifing the x and value has changed to final 0 adhna im taking and checking with the temp, 121 cheking with temp reverse 121.


        }
    }
}
