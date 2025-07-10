package Test1Practice;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] nums={5,10,80,74,3,87};
        int len=nums.length;
        int i=0;
        int j=len-1;
        while (i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
