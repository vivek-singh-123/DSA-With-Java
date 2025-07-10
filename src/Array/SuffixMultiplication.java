package Array;

import java.util.Arrays;

public class SuffixMultiplication {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int len = arr.length;
        int[] suffixmul = new int[len];
        suffixmul[len - 1] = arr[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            suffixmul[i]=suffixmul[i+1]*arr[i];
        }
        System.out.println(Arrays.toString(suffixmul));
    }
}
