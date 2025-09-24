package PracticeQuestion;

import java.util.Arrays;

public class ImplementSelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,50,30,8,36,4,6};

        for(int i=0; i<arr.length-1; i++){
            int smallestIdx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[smallestIdx]){
                    smallestIdx = j;
                }
            }
            int temp = arr[smallestIdx];
            arr[smallestIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
