package Ashok_it;

public class Reversee5 {
    public static void main(String[] args) {
        int [] arr={15,8,9,2,11,4};
        for (int i=0;i<arr.length/2;i++){
            int temp=0;
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];//munde ogake
            arr[arr.length-1-i]=temp;

        }
        for (int n:arr){
            System.out.println(n +" ");
        }
    }
}