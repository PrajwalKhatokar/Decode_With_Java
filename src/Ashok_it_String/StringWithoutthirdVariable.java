package Ashok_it_String;
//i neeed to swap without using the third varibale

// input s1= java
// input s2= program

//output s1=program
//output s2=java
public class StringWithoutthirdVariable {
    public static void main(String[] args) {
        // just think
        String s1="java";//its length 4
        String s2="program"; // its length 7
        //now interger na not storing im storing :::"javaprogram" im using "s1 as substring"
        s1=s1+s2;// ie 4+7 = 11 will be stored in the "a".it wil become "javaprogram"
        //taking substring From main String, i need some part ok na from s1 ok....
        s2=s1.substring(0,s1.length()-s2.length());//11-7=4 iefrom 0 to 4 (4 exculsive) i got "java" stored in b
        s1=s1.substring(s2.length());//means s2 has 4 now ,im staring from s2 to not mentioned
        //the end  therfore i get "program"

        System.out.println("s1="+s1);
        System.out.println("s2="+s2);


    }
}
