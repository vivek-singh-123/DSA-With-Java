package Array;

import java.util.Arrays;

public class SuffixSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int len=arr.length;
        int[] suffixsum=new int[len];
        suffixsum[len-1]=arr[len-1];
        for(int i=len-2; i>=0; i--){
            suffixsum[i]=suffixsum[i+1]+arr[i];
        }
        System.out.println(Arrays.toString(suffixsum));
    }
}
