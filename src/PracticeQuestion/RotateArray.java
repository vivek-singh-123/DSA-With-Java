package PracticeQuestion;

import java.util.Arrays;

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=3;
        int n = arr.length;

//        int[] temp =new int[n];          T.C ==> O(n) & S.C ==> O(n)
//        for(int i=0; i<n; i++){
//            temp[(i+k)%n] = arr[i];
//        }
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = temp[i];
//            System.out.print(arr[i]+" ");
//        }

        k = k%n;                          // T.C ==> O(n) & S.C ==> O(1)
        int start = 0, end = n-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        start = 0; end = k-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        start = k; end = n-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
