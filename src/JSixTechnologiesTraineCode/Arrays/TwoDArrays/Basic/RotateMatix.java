package JSixTechnologiesTraineCode.Arrays.TwoDArrays.Basic;

public class RotateMatix {
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

        System.out.println();

        // now Reverse logic applying to the transpose so that now ega rotate 90 degre haguthe

        for(int i=0;i<m;i++){
            int a=0,b=m-1; //inside erbeku for resetting the value or else 1st row matra reverse remaining remain same
         //        👉 You have 3 plates
                 //👉 You clean plate 1 ✔
//                 👉 Now you must start fresh for plate 2
            
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
        print(arr);

    }

}

//output
//
//        1 2 3
//        4 5 6
//        7 8 9
//
//
//
//        1 4 7
//        2 5 8
//        3 6 9
//

//        7 4 1
//        8 5 2
//        9 6 3