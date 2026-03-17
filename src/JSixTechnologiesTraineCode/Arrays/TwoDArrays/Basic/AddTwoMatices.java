package JSixTechnologiesTraineCode.Arrays.TwoDArrays.Basic;

public class AddTwoMatices {
    public static void main(String[] args) {

        int[][] arr1={{1,9,2},{3,7,4},{8,5,6}};
        int[][] arr2={{9,3,7},{8,6,5},{2,4,1}};
        int m=arr1.length;
        int n=arr2[0].length; // or i can also do arr1[0].length
        int[][] res= new int[m][n]; //important line.size kodbeku idiot ok na

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                 res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//        10 12 9
//        11 13 9
//        10 9 7