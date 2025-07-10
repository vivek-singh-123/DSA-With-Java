package Test1Practice;

import java.util.Arrays;

public class SuffixMax {
    public static void main(String[] args) {
        int[] nums={5,10,4,105,56,35,9,74,66,20,7};
        int len=nums.length;
        int[] result=new int[len];
        result[len-1]=nums[len-1];
        for(int i=len-2; i>=0; i--){
            result[i]=Math.max(result[i+1], nums[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}
