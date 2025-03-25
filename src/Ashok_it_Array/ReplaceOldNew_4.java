package Ashok_it_Array;

import java.util.Scanner;

// program 3
// write a program to replace old element with the new element
// we have 4 case ok
// case 1:update all the occurence
//case 2:update only the first occurence
//case 3:update the Second occurence
//  case 4:update LAST  occurence FOR LOOP ULTA MADU
public class ReplaceOldNew_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the array");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter "  +size+ " elements..");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("array element before update....");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter the old element");
        int olde=sc.nextInt();

        System.out.println("enter the new element");
        int newe=sc.nextInt();
//
//        logic 1:begines case 1: variation :?
//        case 1:update all the occurence
        for (int i=0;i<arr.length;i++){
            if(olde==arr[i]){      // ole element en addru arr[i[ ge equal adre
                                   // haga new ele na a[i] old ele sekiro place nali haku
                arr[i]=newe;
            }
        }

        //output
//        enter the array
//        4
//        Enter 4 elements..
//        10 20 30 10
//        array element before update....
//        10 20 30 10
//        Enter the old element
//        10
//        enter the new element
//        555
//        array element after update....
//        555 20 30 555

//        //case 2:update the first occurence
//
//        for (int i=0;i<arr.length;i++){
//            if(olde==arr[i]){      // ole element en addru arr[i[ ge equal adre
//                                   // haga new ele na a[i] old ele sekiro place nali haku
//                arr[i]=newe;
//                break;// same logic ok na just use break ok na.. haga munde ogala only
//                // 1st occurence nali stop haguthe
//            }
//        }

        //output

//        enter the array
//        5
//        Enter 5 elements..
//        10 20 10 20 30
//        array element before update....
//        10 20 10 20 30
//        Enter the old element
//        10
//        enter the new element
//        50
//        array element after update....
//        50 20 10 20 30


        //case 3:update the Second occurence

        // so now let use the count variable ok na
        // count=2 adre second tym occurence nali update madu
//        int count=0;
//        for (int i=0;i<arr.length;i++){
//                    // I int count=0;      INSIDE FOR LOOP NOT WRITE
//            if(olde==arr[i]) {      // olde element en addru arr[i[ ge equal adre
//                // haga new ele na a[i] old ele sekiro place nali haku
//                count++;  //edhna increment hey madila andre munde ne ogala
//                if (count == 2) {
//                    arr[i] = newe;
//                    break;
//                }
//
//            }
//
//        }
       //OUTPUT

//        enter the array
//        5
//        Enter 5 elements..
//        10 20 30 40 10
//        array element before update....
//        10 20 30 40 10
//        Enter the old element
//        10
//        enter the new element
//        1001
//        array element after update....
//        10 20 30 40 1001

        //logic :begines case 4: variation :?
      //  case 4:update LAST  occurence FOR LOOP ULTA MADU
        for (int i=arr.length-1;i>=0;i--){
            if(olde==arr[i]){      // ole element en addru arr[i[ ge equal adre
                                   // haga new ele na a[i] old ele sekiro place nali haku
                arr[i]=newe;
                break;
            }
        }
 // output

//        enter the array
//        4
//        Enter 4 elements..
//        10 20 30 10
//        array element before update....
//        10 20 30 10
//        Enter the old element
//        10
//        enter the new element
//        55
//        array element after update....
//        10 20 30 55


        System.out.println("array element after update....");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
