package Searching;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={2,3,5,7,11,15,17,21};
        int[] arr2={5,10,20,31,45,60,};
        int len1=arr1.length;
        int len2=arr2.length;
        int[] mergerArray=new int[len1+len2];
        int k=0;
        int i=0; int j=0;

        while (i<len1 && j<len2){
            if(arr1[i]<=arr2[j]){
                mergerArray[k]=arr1[i];
                k++;
                i++;
            } else if(arr1[i]>=arr2[j]){
                mergerArray[k]=arr2[j];
                k++;
                j++;
            }
        }

        while (i<len1){
            mergerArray[k]=arr1[i];
            k++;
            i++;
        }

        while (j<len2){
            mergerArray[k]=arr2[j];
            k++;
            j++;
        }

        System.out.println(Arrays.toString(mergerArray));
    }
}
