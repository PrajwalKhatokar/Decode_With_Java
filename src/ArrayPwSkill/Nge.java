package ArrayPwSkill;
// next greatest find madbeku lets do from reverse method ie lets start from n-1 of arr 1 ok na
//right side ero element jothele compare madkondi ogu
// as we know 9 ele edhe ondh ele 16 yelar kinta small so adh vomit haguthe
//may be last nali hakbhudhithu but 18 yar jothele compare madkoloake hagala so adh max fun hakdhaga barala
//new array ans edhe starting hey fit madu last ele =-1 anta ie ans[n-1]=-1
// ans =-1 edhe adhike i putted 21
// next updatation edhe nge value ie math.max use madidhine and arr e array starting from n-2 ok na
//which means MAth.max(21,28(arr[i]) edhu now 28 become nge edhe tara max erodhu nge hagtirute peace aste
//ne
// sexy understood dhurandar booommmmmm...............
public class Nge {
    public static void main(String[] args) {
        int[] arr={12,8,60,37,2,49,16,28,21};
        int n=arr.length;
        int nge=arr[n-1];
        int[] ans=new int[n];
        ans[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);
        }
        for (int ele: ans){
            System.out.print(ele+ " ");
        }
    }
}
 //output: 60 60 49 49 49 28 28 21 -1