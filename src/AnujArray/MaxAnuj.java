package AnujArray;

public class MaxAnuj {

        public static int MaxOf(int a[]){
            int max=0;
            int n=a.length;
            for(int i=0;i<n;i++){
                if(a[i]>a[max]){
                    max=i;
                }
            }
            return max;

        }

        public static void main(String[] args) {
            int a[]={2,5,8,3,9};
            int n1 =MaxOf(a);
            System.out.println("maximum element is found the index " +n1  +" ");
            System.out.println("maximum element is " +a[n1]  +" ");

        }
}
