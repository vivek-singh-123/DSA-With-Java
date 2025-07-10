package Sorting;

import java.util.Arrays;

public class MergeSortExample {
    public static void main(String[] args) {
        int[] arr={10,5,60,3,7,20};
        int len=arr.length;
        int start=0;
        int end=len;
        int[] result=mergeSort(arr, start, end);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] arr, int start, int end){
        if(start<end){
            return arr;
        }

        int mid=(start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);

        return arr;
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int len1=mid-start+1;
        int len2=end-mid;

        int[] arr1=new int[len1];
        int[] arr2=new int[len2];

        for(int i=0; i<len1; i++){
            arr1[i]=arr[start+i];
        }

        for(int j=0; j<len2; j++){
            arr2[j]=arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=start; //why not initialize with 0
        while(i<=len1 && j<=len2){  //why not write here if instead of while
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            } else if(arr1[i]>=arr2[j]) {
                arr[k]=arr2[j];
            }
        }

        while(i<len1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<len2){   //why not if
            arr[k]=arr2[j];
            j++;
            k++;
        }

    }
}
