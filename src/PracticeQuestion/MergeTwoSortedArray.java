package PracticeQuestion;

import java.util.Arrays;

// Given two sorted arrays arr1 and arr2, merge them into a single sorted array.
public class MergeTwoSortedArray {
    public static void main(String[] args) {  // T.C ==> O(arr1.length + arr2.length) & S.C ==> O(arr1.length + arr2.length)
        int[] arr1 = {2,5,7,11,15};
        int[] arr2 = {3,8,12,15,20};
        int[] mergedArray = new int[arr1.length + arr2.length];
        int k=0;

        int i=0, j=0;
        while (i< arr1.length && j < arr2.length){
            if(arr1[i] >= arr2[j]){
                mergedArray[k] = arr2[j];
                k++;
                j++;
            } else {  // if (arr1[i] < arr2[j])
                mergedArray[k] = arr1[i];
                k++;
                i++;
            }
        }

        while (i < arr1.length){
            mergedArray[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length){
            mergedArray[k] = arr2[j];
            k++;
            j++;
        }

        System.out.println(Arrays.toString(mergedArray));
    }
}
