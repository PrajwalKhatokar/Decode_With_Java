package Ashok_it_Array;

public class Reversee_3 {
    public static void main(String[] args) {
        //task is to reverse an array without losing the first element and store in temp.
        //lets start from the backward.
        int arr[]={34,89,32,67,22,90};
        int temp=0;// to store the 1st element without losing it.
        int size=arr.length-1;//im swapping from back to going alwa so
        for (int i=0;i<size/2;i++){ // divide by 2 because middle nali stop or else mathe turn to original
            //swapping logic to reverse simple no complication
            temp=arr[i];
            arr[i]=arr[size-i]; // why? i:> im need to travel right from back to front so ok
            arr[size-i]=temp;
        }
        for (int rev:arr){
            System.out.println("after reversing " +rev);
        }
    }
}

//Output
//
//after reversing 90
//after reversing 22
//after reversing 32
//after reversing 67
//after reversing 89
//after reversing 34