package AnujArray;
// to check the given array is sorted or not
public class CheckArray {
    public static boolean Sort(int[] a){
        int i=0;
        if(a[i]>a[i+1]){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={5,1,3,7,2};
        System.out.println("is array A is sorted ? true or false ?"  +Sort(a));
        System.out.println("is array B is sorted ? true or false ?"  +Sort(b));
    }
}
