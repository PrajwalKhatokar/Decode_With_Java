package AmazonLeetcode.day2;

public class sqrt {
    public static void main(String[] args) {

    }
    class Solution {
        public int mySqrt(int x) {
            // x=8  let assume
            // i need to return the square root of the x rounded off ok means x= 8 ok na but i need to find its base boos from which number he become 8 so same story like prevoious i nned to use binary seacrh so that i can think and coonnect my brain from which side im geting the base boss ie left or right so i use the binary seach i can jump ok so simple ok.

            //x=4 then return 2 itsems,and x=8 then return 2 itsems ohh


            if(x==0){
                return 0; // hiden casees can have x=0 RETURNING THE VALUE 0 OK
            }

            int left=1; //for squaree rrot number should be >= 1
            int right=x;
            int answer=0; // to store the square root ok
            while(left<=right){ //within the range i need to search ok beauty
                // now first check the middle so that i get an idea wat is there in mid ok
                int mid = left + (right - left) / 2;
                //  mid = 1 + (8 - 1)/2
                // mid = 1 + 7/2
                // mid = 4
                // Use long to avoid overflow: mid * mid can exceed int limit
                long square = (long) mid * mid;// wat ever i get i nneed to compare with the 8 this is already gotten root from base number i nned to find the boss.now mid is 4 -> 4*4 is 16 done.

                if (square == x) { // 16==8 no ,go the elseif
                    return mid; // perfect square if 8==8 then return
                }
                else if (square < x) { //iteration1,16 <8 no jump to else
                    // iteration 2,4<8 yes put 4 in answer
                    //iteration 3,9<8 wrong jump to esle
                    answer = mid;      // mid is valid
                    left = mid + 1;    // try bigger may be exit (so try 3) now left =3 remeber
                }
                else {
                    right = mid - 1;   // square too big, try smaller 3-1=2 and right is now 2 reme,eber
                    //3-1=2 but 3>=2 left is>=2 loop break and return 2
                }
            }

            return answer;
        }
    }
}
