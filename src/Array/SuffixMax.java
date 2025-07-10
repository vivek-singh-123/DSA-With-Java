package Array;

import java.util.Arrays;

public class SuffixMax {
    public static void main(String[] args) {

        int[] arr={11,5,27,15,21,8,3,13};
        int len=arr.length;
        int[] suffixMax=new int[len];
        suffixMax[len-1]=arr[len-1];
        for(int i=len-2; i>=0; i--){
            suffixMax[i] = Math.max(suffixMax[i + 1], arr[i]);
        }
        System.out.println(Arrays.toString(suffixMax));
    }
}
