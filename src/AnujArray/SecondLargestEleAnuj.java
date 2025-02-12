package AnujArray;

public class SecondLargestEleAnuj {

    public static int SecondArray(int a[]) {
        int largest = 0; //let largest lets me asssume as 0
        // think the logic and do the code practically
        int second = -1; // intially let second largest be -1 ok
        if (a.length == 2) return -1; //means nan array nali elemennts bari {1 ,2} edhe edrali
        //yen second largest na find madli so return -1 ok na.
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[largest]) { // a[i] is greater than the largest then largest what we got
                // pour it as the second largest ok
                // and what we got in the i ie largest that one pour in the largest
                //very simple right coding is just about how we think the logic aste ne

                second = largest;
                largest = i;
            } else if (a[i] < a[largest] ){ // a[i] smallest than largest jothege
                //start we assigned seecond ==-1
                if (second == -1 || a[i] > a[second]) {
                    second = i;

                }
            }
        }

        return second;// we need to complete the entire loop before
        // determining the second largest element.
    }


        public static void main(String[] args){
            int a[]={110,90,30,100};
            int sec = SecondArray(a);
            System.out.println("second largest element is:" + a[sec]);
            System.out.println("second largest element is found at the index:" + sec);

        }
    }

