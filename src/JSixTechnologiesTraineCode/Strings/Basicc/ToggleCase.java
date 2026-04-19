package JSixTechnologiesTraineCode.Strings.Basicc;

import java.util.Scanner;

public class ToggleCase {

    // this Problem is all about input a String and toggle all the Character of It.
    //Replace small case with capital case and vice verse
    //PrRajwal
    // small erodhu captial hagbeku and capital erodhu smal hagbeku toggle edhu
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      StringBuilder sb = new StringBuilder(s); // StringBUidler ge input tagotirodhu ok na
        //why ? StringBUilder directly i cant modify the  String ,String is mutable and StringBUilder is Immutable

      for(int i=0;i<sb.length();i++){
         char ch=sb.charAt(i); // character hagi madko so that easy haguthe character ondh ondh jothele ataadake
         int ascii =(int)ch; // character na asci madako so type cast
         if(ascii >=65 && ascii <=90){  // captial range + 32
             ascii+=32;
             ch=(char)ascii;   // again back to character
             sb.setCharAt(i,ch);  //yeli lower ethu ali uper hakidhine now ah particular index nali haku anta so setCharAt
         } else if (ascii >=97 && ascii <=122) {  // edhu small letter same story
             ascii-=32;
             ch=(char)ascii;
             sb.setCharAt(i,ch);
         }
      }
        System.out.println(sb);
    }
}

/**
 * tip
 *
 * uppper case 65 nenp itko saku endiing yenapa 65+26 = 91 .ondh bidu 90
 * lower case start from 97 + 26 = 123 ,ondh bidu 122
 *
 */
//        PraJwal
//        pRAjWAL
