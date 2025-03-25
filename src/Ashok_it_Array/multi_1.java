package Ashok_it_Array;

import java.util.Arrays;

public class multi_1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        // case 1: just printing the mutlidemension elements.
//        arr[0][1]=100;
//        arr[1][1]=200;
//        arr[1][0]=300;
//        arr[1][1]=400;
//        System.out.println(Arrays.toString(arr));

//        output:[[I@7b23ec81, [I@6acbcfc0]

        // case 2 using for loop
//        arr[0][0]=100;
//        arr[0][1]=200;
//        arr[1][0]=300;
//        arr[1][1]=400;
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr.length;j++){
//                System.out.println(arr[i][j]);
//            }
//        }


         //case 2 using for each loop
        arr[0][0]=100;
        arr[0][1]=200;
        arr[1][0]=300;
        arr[1][1]=400;

//        for(int[]ar:arr){
              //without Arrays.toString....
//            // java print memory address instead of the values
//            System.out.println(ar); // output [I@7b23ec81
//                                     //    [I@6acbcfc0
//        }


        for(int[]ar:arr){

            System.out.println(Arrays.toString(ar));
        }
    }
}
// output [100, 200]
//        [300, 400]