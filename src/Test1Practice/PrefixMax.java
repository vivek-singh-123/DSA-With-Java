package Test1Practice;

import java.util.Arrays;

public class PrefixMax {
    public static void main(String[] args) {
        int[] nums={5,30,20,15,80,90,50,200,105};
        int len=nums.length;
        int[] result=new int[len];
        result[0]=nums[0];
        for(int i=1; i<len; i++){
            result[i]=Math.max(result[i-1], nums[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}
