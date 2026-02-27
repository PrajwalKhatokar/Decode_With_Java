package JSixTechnologiesTraineCode.BasicPrograms;

import java.util.Scanner;

public class SmalestEleInArray {
    public static void main(String[] args) {

                // arr=[10,20,90,50,60]
                System.out.println("enter the Size of the Array");
                Scanner sc= new Scanner(System.in);
                int n= sc.nextInt();
                int arr[]= new int[n];

                //taking input from user

                for(int i=0;i<n;i++){
                    arr[i] =sc.nextInt();
                }
                // making the first element as the largest element
                int min=arr[0];

                for(int i=1;i<n;i++){ // 1st element is assumed as the small as i start from 1
                    if(arr[i]<min){
                        min=arr[i];
                    }
                }

                System.out.println("Smallest element in the Array is:"+min);


            }

        }

