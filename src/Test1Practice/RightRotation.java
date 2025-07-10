package Test1Practice;

import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50,60,70,80,90,100};
        int k=4;
        int len=nums.length;

        rightRotation(nums, len-k, len-1);
        rightRotation(nums, 0, len-k-1);
        rightRotation(nums, 0, len-1);

        System.out.println(Arrays.toString(nums));

    }
    static void rightRotation(int[] nums, int startIndex, int endIndex){
        while (startIndex<=endIndex){
            int temp=nums[startIndex];
            nums[startIndex]=nums[endIndex];
            nums[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
    }
}
