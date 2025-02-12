package AnujArray;

public class SearchEle {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,9,3};
        int n=arr.length;
        int key=9
                ;
        int res=-1;
        for (int i=0;i<n;i++){
            if(arr[i]==key){
                res=i;
                break;
            }
        }
        if(res==-1){
            System.out.println("element not found ");
        }
        else {
            System.out.println("element found at the index "+res);
        }

    }
}
