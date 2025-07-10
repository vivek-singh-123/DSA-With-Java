package Array;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={2,5,9,13,8,17,23,3};
        int len=arr.length;
        int[] prefixsum=new int[len];
        prefixsum[0]=arr[0];
        for(int i=1; i<len; i++){
            prefixsum[i]=prefixsum[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(prefixsum));
    }
}
