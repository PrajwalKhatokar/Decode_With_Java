package JSixTechnologiesTraineCode.BasicPrograms;
import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.*;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        // E D U C A T I O N
        // 0 1 2 3 4 5 6 7 8
        //First traverse read character by character
        // to count the character
        int count=0;
        char ch;
        for(int i=0;i<s.length();i++) {
            ch = s.charAt(i);


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
                    ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        System.out.println(count);



    }
}
//Enter a String
//        educaTION
//5