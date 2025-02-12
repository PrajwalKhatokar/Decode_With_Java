package String;

public class ReverseWordAnuj {
    // both i and j are included
    static void reverseCharacters(char[] s, int i, int j) {
        while(i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }


    //	start  = 11
//	end    = 13
//
//	"Never Give Up"
//	"reveN eviG pU"
//
//	"Up Give Never"
    static String reverseWords(String s) {
        char[] c = s.toCharArray();

        int start = 0;
        int end = 0;
        for(; end < s.length(); end++) {
            if(c[end] == ' ') {
                reverseCharacters(c, start, end-1);
                start = end + 1;
            }
        }
        reverseCharacters(c, start, end-1);

        //step 2
        reverseCharacters(c, 0, s.length()-1);
        return new String(c);
    }

    public static void main(String[] args) {
        String s = "Never Give Up";
        String ans = reverseWords(s);
        System.out.println(ans);

    }
}
