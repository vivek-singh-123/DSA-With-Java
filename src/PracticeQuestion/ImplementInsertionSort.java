package PracticeQuestion;

import java.util.Arrays;

public class ImplementInsertionSort {
    public static void main(String[] args) {
        int[] arr={7,2,90,4,8,16,5,1};

        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

        System.out.println(Arrays.toString(arr));
    }
}
