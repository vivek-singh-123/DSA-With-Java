package Test1Practice;

import java.util.Arrays;

public class BS {
    public static void main(String[] args) {
        int[] nums={6, 7, 8, 1, 2, 3, 4, 5};
        int k=3;
        int len=nums.length;
        left(nums, 0, k-1);
        left(nums, k, len-1);
        left(nums, 0, len-1);

        System.out.println(Arrays.toString(nums));

        //int target=3;

    }
    static void left(int[] nums, int startIndex, int endIndex){

        int temp=nums[startIndex];
        nums[startIndex]=nums[endIndex];
        nums[endIndex]=temp;
    }
}
