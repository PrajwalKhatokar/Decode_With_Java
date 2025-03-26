package String_Pwskills;
//count the number of the vowels
public class StringVowels {
    public static void main(String[] args) {


        String s1 = "hello world hi";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (vowels(ch) == true) {
                count++;
            }
        }
        System.out.print(count);

    }

    public static boolean vowels(char ch) {
        if (ch == 'a' || ch == 'A') return true;
        if(ch == 'e' || ch == 'E') return true;
        if(ch == 'o' || ch == 'O') return true;
        if(ch == 'u' || ch == 'U') return true;
        return false;
    }

}