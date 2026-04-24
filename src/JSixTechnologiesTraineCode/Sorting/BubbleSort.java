package JSixTechnologiesTraineCode.Sorting;

public class BubbleSort {

        // for notes for fast recap refer A4 size College Book ds shot book or drive4830 jsix,sorting

    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2};
        int n = arr.length;
        int temp = 0;
        for(int x=0;x<n-1;x++) {
            boolean flag = true; // edhu for pass see the notes u wil understand
            for(int i=0;i<n-1-x;i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false; // array not sorted
                }
            }
            if(flag==true) break; // array sorted break it

        }
print(arr);

    }
}

//1 2 3 4 5