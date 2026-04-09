package JSixTechnologiesTraineCode.Arrays.TwoDArrays.leetcode;

public class RotateImage {

    public void rotate(int[][] arr) {
        int m = arr.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();
        }
        // now Reverse logic applying to the transpose so that now ega rotate 90    degre haguthe

        for(int i=0;i<m;i++){
            int a=0,b=m-1; //inside erbeku for resetting the value or else 1st row matra reverse remaining remain same
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
    }
}



