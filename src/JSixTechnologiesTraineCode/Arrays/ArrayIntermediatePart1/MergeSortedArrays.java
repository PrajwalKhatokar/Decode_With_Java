package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart1;

import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of first Array");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the Array1 Elements");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
//...................................................................................
        System.out.println("enter the size of Second Array");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the Array2 Elements");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
//....................................................................................
        int[] result = merge(arr1, arr2);

        System.out.println("Merged array:");
        for(int x : result){
            System.out.print(x + " ");
        }

    }

//..................................................................................
    // logic starts
    // merge sorted Arrays
    // arr1 = {10,20,30,40,50}
    // arr2 = {60,70,80,90,100}
    // result ={ 10,20,30,40,50,60,70,80,90,100}
    // using 3 pointer method
    public static int[] merge(int arr1[], int arr2[]) {

        int i = 0, j = 0, k = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int result[] = new int[n1+n2];
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                 result[k] = arr1[i];
                i++;
            }
            else{
                result[k]=arr2[j];
                j++;
            }
                k++;

        }
           while(i<n1){     // mele i<n1 and j<n2 o to 4 aste , but last nali element ulkouthe adhan we copy
               //to the k , ie first value copy then post increment move forward so ++
               // ie mele After main comparing loop finished:
               //result = 1 2 3 4 5 6 7 _
               //Pointers now:
               //i = 4
               //j = 3
               //k = 7
               // i comepleted j left ,sometimes i remain j get completes
               result[k++]=arr1[i++];
           }

        while(j<n2){
            result[k++]=arr2[j++];
        }
return result;

    }
}

//C:\Java_2024\jdk_22\bin\java.exe --enable-preview "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=65401:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\prajw\OneDrive\Documents\PRAJWAL\pw142024dsa\JavaShot\out\production\JavaShot JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart1.MergeSortedArrays
//enter the size of first Array
//5
//Enter the Array1 Elements
//1 2 3 4 5
//enter the size of Second Array
//5
//Enter the Array2 Elements
//6 7 8 9 10
//Merged array:
//1 2 3 4 5 6 7 8 9 10