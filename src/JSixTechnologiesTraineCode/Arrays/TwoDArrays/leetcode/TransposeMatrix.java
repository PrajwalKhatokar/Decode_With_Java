package JSixTechnologiesTraineCode.Arrays.TwoDArrays.leetcode;
//5.Given a 2D integer array matrix, return the transpose of matrix.
//The transpose of a matrix is the matrix flipped over its main diagonal,
//switching the matrix's row and column indices.
class Solution {
    public int[][] transpose(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[][] transpose = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                transpose[j][i]=arr[i][j];
            }
        }
        return transpose;

    }
}