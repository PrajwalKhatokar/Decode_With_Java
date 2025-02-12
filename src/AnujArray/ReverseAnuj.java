package AnujArray;

public class ReverseAnuj {
    public static void reverse(int a[]){
        int left=0;
        int right=a.length-1;
        while(left<right){
            int temp = a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        System.out.println("orginal array");
            for(int e : a) {
                System.out.print(e +" ");
            }
        System.out.println();

                reverse(a);
                System.out.println("reversed array");
                    for(int e : a) {
                        System.out.print(e +" ");
                    }
    }
}
