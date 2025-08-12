package Ashok_it_Array;

        public class Min_Max_2 {
            public static void main(String[] args) {
                int arr[]={10,40,50,45,789,900,9,1};
                int min=arr[0];
                int max=arr[0];
                int size=arr.length;
                for (int i=0;i<size;i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    } else if (arr[i] < min){
                        min = arr[i];
                    }
                }
                System.out.println("maximum number in the array is :" +max);
                System.out.println("minimum number in the array is :" +min);
            }
        }

//        Output:
//        maximum number in the array is :900
//        minimum number in the array is :1