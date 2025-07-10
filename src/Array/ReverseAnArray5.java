package Array;

import java.util.Arrays;

public class ReverseAnArray5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] res=reverseArray(arr,0,8);
        System.out.println("after: "+Arrays.toString(res));
    }

    public static int[] reverseArray(int[] arr, int start, int stop){
        int i=start;
        int j=stop;
        System.out.println("before: "+Arrays.toString(arr));
        while(i<j){
            int store=arr[i];
            arr[i]=arr[j];
            arr[j]=store;
            i++;
            j--;
        }
        return arr;
    }
}
