package Array;

import java.util.Arrays;

public class ReverseAnArray3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int len=arr.length;

        int i=0;
        int j=5;

        while(i<j){
            int swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
