package Array;

import java.util.Arrays;

public class PrefixMax {
    public static void main(String[] args) {
        int[] arr={10,59,64,9,68,26,59,89,36};
        int len=arr.length;
        int[] preMax=new int[len];
        preMax[0]=arr[0];
        for(int i=1; i<len; i++){
            preMax[i] = Math.max(preMax[i - 1], arr[i]);
        }
        System.out.println(Arrays.toString(preMax));
    }
}
