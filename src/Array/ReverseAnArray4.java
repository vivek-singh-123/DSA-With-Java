package Array;

import java.util.Arrays;

public class ReverseAnArray4 {
    public static void main(String[] args) {

        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int len=arr.length;
        int i=0;
        int j=len-1;
        System.out.println(Arrays.toString(arr));
        while(i<j){
            int store=arr[i];
            arr[i]=arr[j];
            arr[j]=store;
            i++;
            j--;
        }
        System.out.println("After reverse: "+Arrays.toString(arr));
    }
}
