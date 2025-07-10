package Array;

import java.util.Arrays;

public class PrefixMin {
    public static void main(String[] args) {
        int[] arr={11,5,10,15,21,8,2,13};
        int len=arr.length;
        int[] preMin=new int[len];
        preMin[0]=arr[0];
        for(int i=1; i<len; i++){
            preMin[i] = Math.min(preMin[i - 1], arr[i]);
        }
        System.out.println(Arrays.toString(preMin));
    }
}
