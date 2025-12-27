package ArrayPwSkill.LeetCodeProblems;

public class TwoPointerReverseArray {
    public static void main(String[] args) {
        int[] arr={ 10,20,30,40,50,60,70,80,90};
        int n=arr.length;
        int i=0,j=n-1;//case 1-> reverse all,og guru why j=n-1 dont do idiot thinking
        // because i start from 0 and j is going in the reverse direction.think u wil get the answer
//        int i=1,j=5; ->//case 2 if i want to change the specific part ok na
        int temp=0;
        while(i<=j){ // 10 20 30 40 50 i coming from 10 so increasing
                     // j is going from back so decreasing
                     // i and j eye contact at 30,if j moves heading towards 20 mathe it become
                     // 10 20 30 40 50 revrse hagala so i need to stop
                    // i and j eye contact hago vargu reverse so i<=j ,j should not cross i
                    // super kaneye nice ok na
//                   swaping logic
//                    temp=a;
//                    a=b;
//                    b=temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int ele:arr){
            System.out.print(ele +" ");
        }
    }
}
// case 1:
//Output:90 80 70 60 50 40 30 20 10

// case 2: reverse only the specific part of the array for this change the i and j value
//10 60 50 40 30 20 70 80 90