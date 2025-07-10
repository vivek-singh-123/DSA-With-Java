package Test1Practice;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int k=3;
        int len=nums.length;

        leftRotation(nums, 0, k-1);
        leftRotation(nums, k, len-1);
        leftRotation(nums, 0, len-1);

        System.out.println(Arrays.toString(nums));
    }
    static void leftRotation(int[] nums, int startIndex, int endIndex){
        while (startIndex<=endIndex){
            int temp=nums[startIndex];
            nums[startIndex]=nums[endIndex];
            nums[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
    }
}
