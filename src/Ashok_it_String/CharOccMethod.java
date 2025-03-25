package Ashok_it_String;
// Program : 1 WAP to count the total number of occurences of the given
//character in the String.

// Method 1: USing the charAt() method
//public class CharOccMethod {
//    public static void main(String[] args) {
//        String s="java";
//        char ch='a';  // if i not give this also it work it is just a input from the company
//        int count=0;
//        for (int i=0;i<s.length();i++){
//            if (s.charAt(i) == 'a') {
//
//                count++;
//            }
//
//        }
//        System.out.println(count);
//    }
//}

//Method 2 : Using the toCharArray() -> in which we convert the String to the
// character Array.

public class CharOccMethod {
    public static void main(String[] args) {
        String s="java";
        // char ch='a'; input from company edhu
        char[] arr=s.toCharArray();
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]== 'a') {

                count++;
            }

        }
        System.out.println("in the word java the character a appeared to be: "+count);
    }
}

