package String;

public class AnagramAnuj{

    static boolean anagram(String s1,String s2) {
        int a[] = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i)]++;
        }
        // comment is for reference when comparing if we get -1 then not an anagram
        for(int e: a){
            System.out.print(e+ " ");
        }
        System.out.println();

        for (int i = 0; i < s2.length(); i++) {
            a[s2.charAt(i)]--;
        }

        for(int e: a){
          System.out.print(e+ " ");
        }
        System.out.println();


        for (int e : a) {
            if (e != 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String s1="Hello";
        String s2="hello";
        System.out.println(anagram(s1,s2));
    }
}






