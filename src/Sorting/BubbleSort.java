package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={10,45,26,56,96,7,2};
        int len=arr.length;

        int[] result=bubbleSort(arr, len);
        System.out.println(Arrays.toString(result));
    }

    static int[] bubbleSort(int[] arr, int len){
        for(int i=0; i<len-1; i++){
            for(int j=0; j<len-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
