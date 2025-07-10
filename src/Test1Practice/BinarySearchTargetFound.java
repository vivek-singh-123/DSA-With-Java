package Test1Practice;

public class BinarySearchTargetFound {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50,60,70,80};
        int target=40;
        int len=nums.length;
        int start=0;
        int end=len-1;

        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                break;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
    }
}
