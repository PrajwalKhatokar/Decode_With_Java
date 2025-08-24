//8.find the Number of Occurence in the given Array->NumberOccurence.java
//package TapArrays;
package TapArrays;
import java.util.Scanner;

public class NumberOfOccurence{

    static int Occurence(int arr[],int key){
        int count=0;

        for (int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key element to search the number of occurence");
        int key= sc.nextInt();
        int res=Occurence(arr,key);
        System.out.println("number of times occured: " +res);
    }
}

//Output:
//enter the size of the array
//5
//        10 10 10 10 8
//enter the key element to search the number of occurence
//10
//number of times occured 4