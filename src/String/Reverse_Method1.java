package String;

public class Reverse_Method1 {
    public static void main(String[] args) {
        String str="hello";
        // convert this String into the character array ok na so what is do means i use the
        //toCharArray and its return type is charArray ok na simple
        char[] ch=str.toCharArray();
        //use for loop for reversing ok na
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);// ondh ondh 4 ,3,2,1,0 endha iteratate haguthe
            // 4 nali o
            // 3 nali l
            //2 nali l
            //1 nali e
            //0 nali h
             // etara it wil print super ha

            //sout(ch) //etara kotre it wil print only hello 5 times length 5 edhe ala so
        }
    }
}
