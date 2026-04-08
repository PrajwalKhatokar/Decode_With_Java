package JSixTechnologiesTraineCode.Arrays.TwoDArrays.Basic;

public class TransposeofMatrixNoooExtraArray {


    // lets write print function to print the array

    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //transpose of matrix without using the extra array ok na
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        int m=arr.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            System.out.println();
        }
        print(arr);
    }
}


//output
//        1 2 3
//        4 5 6
//        7 8 9
//
//
//
//        1 4 7
//        2 5 8
//        3 6 9