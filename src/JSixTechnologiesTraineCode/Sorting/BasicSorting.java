package JSixTechnologiesTraineCode.Sorting;

public class BasicSorting{
    // for notes for fast recap refer A4 size College Book ds shot book or drive4830 jsix,sorting
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,0};
        int n=arr.length;
        boolean flag = true;
        for(int i = 0; i<n-1;i++){
            if(arr[i] > arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag==true) System.out.println("sorted");
        else System.out.println("not sorted");
    }
}


//not sorted
