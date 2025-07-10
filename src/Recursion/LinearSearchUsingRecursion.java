package Recursion;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] nums={10,48,45,35,9,89,3,56};
        int target=9;
        int i=0;
        int len=nums.length;
        int j=len-1;
        int result=linearSearch(nums, i, j, target);
        System.out.println(result);
    }
    static int linearSearch(int[] nums, int i, int j, int target){
        if(i>j){
            return 0;
        }
            if(nums[i]==target){
                return i;
            }
            return linearSearch(nums, i+1, j, target);
    }
}
