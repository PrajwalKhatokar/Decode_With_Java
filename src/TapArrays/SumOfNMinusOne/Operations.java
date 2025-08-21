//6.sum of n-1 means i if the array size is 5 i need to find for the 4 element there max
//min value

package TapArrays.SumOfNMinusOne;

public class Operations {

    static int Summation(int arr[]){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    static long max=Integer.MIN_VALUE;  //  if i give max as 0 ,and if array if -1 -3 -5 i get answer as 0 only o max alwa
    static long maximo(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static long mini=Integer.MAX_VALUE;  // see case 2 output
    static long minimum(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[i]<mini){
                mini=arr[i];
            }
        }
        return mini;
    }

}
