package JSixTechnologiesTraineCode.Arrays.TwoDArrays.Basic;

import java.sql.SQLOutput;

public class MaxSum {
    public static void main(String[] args) {

        // remember na yenu eli user endha input na tagothila ok
        //im doing hard coding ie direct nane array koti.
        //row and columns itkondi im printing
        int[][] arr={{1,2,3},{4,5,6}};
        int m=arr.length;// for rows
        int n=arr[0].length;// for column yest edhe anta edhu
        int max=Integer.MIN_VALUE;
        int sum=0;
        //lets travserse
        // for loop ge tricks press fori
        // already element ede so nin input kodo necessity ila ok na
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
               max=Math.max(max,arr[i][j]);
               sum+=arr[i][j];// ie sum+arr[i][j] -> 0 +(ij 0,1 adre element 1 ) 0+1=1 etara simple
            }
        }
        System.out.println("maximum value is :"+max);
        System.out.println("sum is:"+sum);
    }
}
//maximum value is :6
//sum is:21