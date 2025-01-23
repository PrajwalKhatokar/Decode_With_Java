package String;

public class reverse {
    public static void main(String[] args) {
        String str="hello";
        char[] ch=str.toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.println(ch[i]);
        }
    }
}
