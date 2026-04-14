package JSixTechnologiesTraineCode.Strings.Lifesaver;

import java.util.HashMap;
import java.util.Scanner;

public class frequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        // Character -> now to remember the character that we have visited
        // Integer -> to remember the frequency count

        // count frequency
        for (int i = 0; i < s.length(); i++) {

            char curr = s.charAt(i);

            // increase count
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            //map.put(key,value)
            //put value ila andre store maduthe and value edare update maduthe
            //map.getOrDefault(Curr,0)+1, impt ok na memory nali value edia anta nodtine
            // ilva 0 jothele 1 haki update ,direct 1 hakidre next time nali previous we will lose
            // the frequency

        }
        // print frequency
//        Map stores data internally
//        But we need to access each key-value pair
//        map.keySet() ->All keys present in map
//        For each character in map:  Take one key at a time
//        map.keySet() → gives all keys
//        map.get(key) → gives value


        for (char key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));//👉 Print:key + its value

        }

    }
}
//banana
//a -> 3
//b -> 1
//n -> 2