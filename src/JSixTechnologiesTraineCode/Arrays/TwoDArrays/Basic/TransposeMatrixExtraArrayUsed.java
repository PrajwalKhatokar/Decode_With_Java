package JSixTechnologiesTraineCode.Arrays.TwoDArrays.Basic;
//Write a Program to transpose a matrix entered by the user and stored in the new matrix(2d array)
public class TransposeMatrixExtraArrayUsed {
    public static void main(String[] args) {
        //once see the notes u wil understand
        //4 2 eli 0,0 0,1 hagtide row 1 tym silent and j 2 tym repeating
        //1 5     1,0 1,1 same story
        //6 9
        // transpose of matrix means row na column wise madodh
        // now column wil sit for one time and row wil repeat
        // ie
        // 4 1 6  eli if i do transpose column  mele nodu column silent but row is repeating
        // 2 5 9  so loops are reverse madko
        // vvip logic transpose of matrix nali array m*n edhare transpose n*m eruthe
        // transpose madi i need to store in the other array our motive
        int[][] arr={{4,2},{1,5},{6,9}};
        int m=arr.length;
        int n=arr[0].length;
        int[][] transpose = new int[n][m]; // our core logic m*n -> n*m haguthe

      for (int j = 0; j < n; j++) {    // our core logic m*n -> n*m haguthe
            for (int i = 0; i < m; i++) {   /// our core logic m*n -> n*m haguthe
                transpose[j][i]=arr[i][j];
                System.out.print(transpose[j][i]+" ");// our core logic m*n -> n*m haguthe
            }
            System.out.println();
        }
    }
}

//output

//        4 1 6
//        2 5 9