package JSixTechnologiesTraineCode.Strings.Lifesaver;

import java.util.HashMap;
import java.util.Scanner;

public class CountWordFrequencyinSentence {
    public static void main(String args[]){


            // i need to find the frequency in the String Word not the character

            Scanner sc= new Scanner(System.in);
            String s= sc.nextLine();

            String[] words=s.split(" "); //// vvip split into WORDS (not characters) means " " etara erbeku "" etara edhare character frequency koduthe

            HashMap<String,Integer> map = new HashMap<>();

            for(int i=0;i<words.length;i++){ // word length beku so words.length not s.length
                String word=words[i];
                map.put(word,map.getOrDefault(word,0)+1);
            }

            for(String key:map.keySet()){
                System.out.println(key+ " -> " +map.get(key) );
            }

    }
}
