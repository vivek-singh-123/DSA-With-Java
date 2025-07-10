package Array;

import java.util.Arrays;

public class SuffixMin {
    public static void main(String[] args) {
        int[] arr={11,5,2,15,21,8,3,13};
        int len=arr.length;
        int[] suffixMin=new int[len];
        suffixMin[len-1]=arr[len-1];
        for(int i=len-2; i>=0; i--){
            suffixMin[i] = Math.min(suffixMin[i + 1], arr[i]);
        }
        System.out.println(Arrays.toString(suffixMin));
    }
}
