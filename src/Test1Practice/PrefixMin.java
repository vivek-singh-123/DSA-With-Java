package Test1Practice;

import java.util.Arrays;

public class PrefixMin {
    public static void main(String[] args) {
        int[] nums={15,10,20,60,9,25};
        int len=nums.length;
        int[] result=new int[len];
        result[0]=nums[0];
        for(int i=1; i<len; i++){
            result[i]=Math.min(result[i-1], nums[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}
