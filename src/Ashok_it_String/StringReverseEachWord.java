package Ashok_it_String;
// reverse each word in the String.
public class StringReverseEachWord {
    public static void main(String[] args) {
        String s = "hello World im Prajwal";

        String[] arr = s.split("\\s");
        for (int i = 0; i < arr.length; i++) {
            String a = arr[i];

            StringBuffer sb = new StringBuffer(a);
            sb.reverse();
            System.out.print(" "+sb);
        }
    }

}
