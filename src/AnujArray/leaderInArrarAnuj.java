package AnujArray;

public class leaderInArrarAnuj {

    public static int Largest(int a[]){
        int largest=Integer.MIN_VALUE;
        for (int i=a.length-1;i>=0;i--){
            if(a[i]>largest){
                largest=a[i];
                System.out.print(a[i]+" ");
            }

        }
                return largest;

    }
    public static void main(String[] args) {
        int a[]={2,7,6,1,4,3};
        int res = Largest(a);
        System.out.print(res);


    }
}
