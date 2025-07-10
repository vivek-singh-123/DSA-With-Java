package Recursion;

import java.util.Arrays;

public class ReverseAnArrayUsingRecursion {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50,60,70,80,90,100};
        int len=nums.length;
        int i=0;
        int j=len-1;

        int result[]=reversenumber(nums, i, j);
        System.out.println(Arrays.toString(result));

    }
    static int[] reversenumber(int[] nums, int i, int j){
        if(i>j){
           return nums;
        }

            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            return  reversenumber(nums, i+1, j-1);

    }
}
