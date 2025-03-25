package Ashok_it_String;
// count number of the Wordcount
public class StringWordCount {
    public static void main(String[] args) {
        String s1=" hello world welcome";
        String [] s=s1.trim().split("\\s+");
        System.out.println(s.length);


    }
}
