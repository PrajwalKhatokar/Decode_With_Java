package ArrayPwSkill.Practise;

import java.util.Scanner;

public class Worksheet {
    public static void main(String[] args) {
        int[] arr={90,49,10,39,22,4};
        int n=arr.length;
        int i=0,j=n-1;
        int temp=0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(" "+ele);
        }
    }

}