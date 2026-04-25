package JSixTechnologiesTraineCode.Sorting;

public class SelectionSort {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10, -4, 20, 1, -6, 8};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mind = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mind = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mind];
            arr[mind] = temp;


        }
        print(arr); // calling print funtion nin sout haki print madbeda
    }
}

//-6 -4 1 8 10 20