package JSixTechnologiesTraineCode.Strings.Basicc;

public class CountVowelConsonants {
    public static void main(String[] args) {

        String str = "Prajwal Khatokar";
        char[] ch = str.toCharArray();

        int v = 0, c = 0;

        for (int i = 0; i < str.length(); i++) {

            if ("aeiouAEIOU".indexOf(ch[i]) != -1) {
                v++;
            } else if (ch[i] != ' ') {   // ignore space
                c++;
            }
        }

        System.out.println("vowel count: " + v);
        System.out.println("consonant count: " + c);
    }
}
//vowel count: 5
//consonant count: 10