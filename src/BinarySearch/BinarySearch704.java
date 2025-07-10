package BinarySearch;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] nums={-1,5,10,30,56,66,89};
        int target=30;

        int result=binarySearch(nums, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] nums, int target){
        int len=nums.length;
        int startIndex=0;
        int endIndex=len-1;

        while(startIndex<=endIndex){
            int mid=(startIndex+endIndex)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                startIndex=mid+1;
            }else {
                endIndex=mid-1;
            }
        }
        return -1;
    }
}
