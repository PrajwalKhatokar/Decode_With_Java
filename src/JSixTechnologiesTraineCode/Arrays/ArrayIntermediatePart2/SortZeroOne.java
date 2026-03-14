package JSixTechnologiesTraineCode.Arrays.ArrayIntermediatePart2;

public class SortZeroOne {
    public static void main(String[] args) {

//        logic
        // logic
//        0 1 2 3 4 5 6
//        0 0 1 0 1 0 1
//        arr[i]=0; starting element hey 0 edhaare
//        arr[j]=1; last element q edhare
//        1st reverse logic so taat i can sort it wont cross i<j
//        i>j adre break, becuase mathe unsorted hagbiduthe nodu down if en madtuhe mathe sort madi unsorted koduthe
//        when i swap
//        if(arr[i]==1 && arr[j]==0){
//            arr[i]=0;
//            arr[j]=1;
//
//        }
        int[] arr={0,1,0,1,0,0,0,1,0,1,0,1};
        int n=arr.length;
        //solution logic starts
        int i=0,j=n-1;
        while(i<j){
            if (arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for (int ele: arr){
            System.out.print(ele+" ");
        }
    }
}


//Output:
//
//        0 0 0 0 0 0 0 1 1 1 1 1