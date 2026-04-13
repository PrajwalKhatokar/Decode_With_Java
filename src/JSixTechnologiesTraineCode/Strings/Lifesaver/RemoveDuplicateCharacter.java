package JSixTechnologiesTraineCode.Strings.Lifesaver;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();

        StringBuilder result= new StringBuilder(); // stringBuilder im using because String use madidre
        // it wil create object again and again and consume more memory

        // now to remember the character that we have visited

        HashSet<Character> set = new HashSet<>();  // edhu for remember the character wat we have visted

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(!set.contains(ch)){ //
                // !false is true then block nali erodh execute
                // programming , 4th index r banthu anko !true is false skip
                // wat i came to know from this is ie if i get duplicate one i wil skip aste simple

                result.append(ch); //Build answer
                set.add(ch);    // we are storing in the memory,system forgets → duplicates appear again
            }
        }

        System.out.println(result.toString());
    }
}
//Enter a String
//        Programming
//Progamin


