package ArrayPwSkill;

public class MergeTwoSortArray {
    public static void main(String[] args) {
        //ful top bottom explaination i wil try to write what ever i have in mind also in the book
        //now i have 2 sorted array ie down see
        int[] a = {10, 20, 30, 40};
        int[] b = {50, 60, 70, 80, 90, 100, 110}; //case1 nali both equal case 2 tagolona
        // let assume if a has more ele than b vice versa
        // henge erli but in our case b nali jasti edhe logic
        //both gu bariyona.
        //next en andre a and b merge madi ondhe array nali hakbeku
        // no extra array ok na
        // yen madona andre a.length =4
        // b.length= 7 ok na,c anta ondh array madona adrali edru
        // both length hakona i get 4 +7 =11 size length array ok na
        int[] c = new int[a.length + b.length];
        //most impt cond yenu..?
        int i = 0, j = 0, k = 0;// aray a ,b,c avrdh index edhu ok na
        while (i < a.length && j < b.length) {  //yeli vargu repeat adre i length and j length vargu
            if (a[i] <= b[j]) { //i<=j ah small ele na k haku anta,amele ah ele endha munde ogake
                               //i++ ok na ,and k ge ele sekide munde ogake k++.
                c[k] = a[i];
                i++;
                k++;
            } else {             // edhu if b[j]<=a[j] edhare ah ele na k ge haku same story
                c[k] = b[j];
                j++;
                k++;
            }
        }
            if (i == a.length) {  //i reach to a.length then b nali erodh a ge haku mele < tagond edhine
                                  //while nali edh yak helide andre if u do 3==4 madidre but actual adhu 3==3 ne
                                  // edh yak andre if a nali ero array ele 4 edhe and b nali 8 edhe
                                  // i full bandi a.length nali stoped now next
                                  // now b nali ero remaiing ele na go til b.length and adrali erodh yela
                //put in c
                while (j < b.length) {
                    c[k] = b[j];
                    j++;
                    k++;
                }
            }
                    if (j== b.length) {      // same story b length 4 anko a jasti ede then same story
                        while (i < a.length) {
                            c[k] = a[i];
                            i++;
                            k++;
                        }
                    }
                    for(int ele : c){
                        System.out.print(ele +" ");
                    }
                }
            }


// output:

//10 20 30 40 50 60 70 80 90 100 110

