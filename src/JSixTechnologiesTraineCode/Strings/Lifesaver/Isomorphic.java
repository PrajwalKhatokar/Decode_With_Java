package JSixTechnologiesTraineCode.Strings.Lifesaver;
import java.util.*;
public class Isomorphic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.length() != t.length()) {
            System.out.println(false);
            return;  //jvm na stopping length hey equal hagila andre inside ogodh waste anta.
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        // two hashmap we used
        //1.ondhrali  key and value ne eruthe
        //2.edrali reverse of key and value edhu,edrali original key and value barbardhu
        // only reverse erbeku ie map2 nali

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
//first haku memory nali key and value na ie else part nodkoluthe if nali mismatch adre
            // c1 and c2 ie paper hakide tiler nodu p nali t ne erbeku but l edhe mismatch ok na false return and break the loop.
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) {
                    System.out.println(false);
                    return;
                }
            } else {
                map1.put(c1, c2);
            }
            // eli reverse ge reverse edhare no worries bere edhare false
            //also one to one mapping we checking ie reverse mapping
//          Yes — we are checking whether the target character is already mapped
//           and if it is mapped to a DIFFERENT source → then it is invalid
            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) {
                    System.out.println(false);
                    return;
                }
            } else {
                map2.put(c2, c1);
            }
        }

        System.out.println(true);
    }
}

//paper
//        title
//true


//raam
//        hjam
//false