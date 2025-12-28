package ArrayPwSkill;

public class MaximumElementInAnArray {
    public static void main(String[] args) {


        int[] arr = {10,399,455,22,1000,43,49};
        int max=arr[0];
        int size=arr.length;
        for (int i=0;i<size;i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        System.out.println("MaximumElement is:" +max);
    }
}
// OutPut:
//MaximumElement is:1000