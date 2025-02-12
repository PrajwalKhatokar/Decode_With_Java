package AnujArray;

public class DeleteEle {

    public static int delete(int a[], int key){
        int n= a.length;
        for(int i=0;i<n;i++){
            if(a[i]==key) {
                break;
            }
        }
        int i=0;
        if(i==n) return n;
        for(int j=i;j<n-1;j++){
            a[j]=a[j+1];

        }
        return n-1;

    }
    public static void main(String[] args) {
        int a[]={2,6,9,3,5};
        int key=9;
        int newsize=delete(a,key);
        for (int i=0;i<newsize;i++){
            System.out.println(a[i] + " \t ");
        }

    }

}




