package Only_for_Practice;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={7,2,90,4,8,16,5,1};
        System.out.println("this is actual array:"+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("and this is sorted array:");
        for (int a: arr){
            System.out.print(a+" ");
        }

    }

    static void insertionSort(int[] arr){
        int len=arr.length;

        for(int i=1; i<len; i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
