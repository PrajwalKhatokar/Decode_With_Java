package ArrayPwSkill.LeetCodeProblems;
//this is leetcode problem here no  main method
//leetcode solution only logic
//Practise same thing in leetcode if u want  here i kept for  understanding and like
// notes
//75 Sort color edhu..(sort 0,1,2) this only leetcode ppl taken as color simple,
// for notes refer pdf 4830 drive notes
class SortColor {

    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int mid=0,low=0,high=n-1;
        while(mid<=high){  // always check condtion with the index,mid<=high kotre ne it wil work
            // mid<=high
            // 2 0 2 1 1 0
            //     mid
            //     high ,here mid and high both are at middle
            // let only 2 edhe  mid=2 and high=2 ,ondhe ele both are same hey 2 ,2                          // ne swap so must condition mid<=high
            // mid<high,i get the error..
            if(nums[mid]==0) {
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1) {
                mid++;
            }
            else{ //means nums[mid]==2
                swap(nums,mid,high);
                high--;
            }
        }
    }
}