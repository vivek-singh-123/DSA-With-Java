package Rotation;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        int len=nums.length;
        int k=3;
        reverseOfAnArray(nums, 0, k-1);
        reverseOfAnArray(nums, k, len-1);
        reverseOfAnArray(nums, 0, len-1);

        System.out.println(Arrays.toString(nums));
    }
    public static void reverseOfAnArray(int[] nums, int startIndex, int endIndex){
        while ((startIndex < endIndex)){
            int temp=nums[startIndex];
            nums[startIndex]=nums[endIndex];
            nums[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
    }
}
