package JSixTechnologiesTraineCode.Strings.Basicc;

public class StringCountVowel {

    public static boolean isvowels(char ch) {
        if (ch == 'a' || ch == 'A') return true;
        if (ch == 'e' || ch == 'E') return true;
        if (ch == 'i' || ch == 'I') return true;
        if (ch == 'o' || ch == 'O') return true;
        if (ch == 'u' || ch == 'U') return true;

        return false;
    }


    public static void main(String[] args) {
        String s = "aeiou";
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i); // i nned character i passing the index
            if (isvowels(ch) == true) {
                count++;
            }
        }

        System.out.println(count);

    }

}

//output : 5