package Ashok_it_String;

public class StringReverse {
    public static void main(String[] args) {

        //method 1 :using the Stringbuilder ,ie using the reverse()...

//        StringBuffer br=new StringBuffer("java");
//        br.reverse();
//        System.out.println(br);


        //method :2 using the charAt(index) method.

        // j a v a


        String s = "java";
        String rev = "";  // WE ARE STORING THE JAVA IN THE SEPREATE STRING.

        for (int i = s.length() - 1; i >=0; i--) {
            rev = rev + s.charAt(i);


        }
        System.out.println("reverse of the java :" + rev);

    }
    }

 //method 3: using the tocharArray()

//        String s="java";
//        String rev="";  // WE ARE STORING THE JAVA IN THE SEPREATE STRING.
//        char[] arr=s.toCharArray();
//
//
//        for (int i=arr.length-1;i>=0;i--){
//            rev=rev+arr[i];
//        }
//        System.out.println(rev);
//    }
//}
