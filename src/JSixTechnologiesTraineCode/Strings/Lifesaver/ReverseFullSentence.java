package JSixTechnologiesTraineCode.Strings.Lifesaver;
import java.util.*;
public class ReverseFullSentence {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            String[] words = s.split(" ");
            String result = "";

            for (int i = words.length - 1; i >= 0; i--) {

                result = result + words[i];  // remember like previous tara im not reverseing word by word erodhne last endha printing


                if (i != 0) {
                    result = result + " ";
                }
            }

            System.out.println(result);
        }
    }


//i love coding
//coding love i