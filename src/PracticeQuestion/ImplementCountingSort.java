package PracticeQuestion;

import java.util.Arrays;

public class ImplementCountingSort {  //works on only non-negative integer
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        // find max value
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }

        // create count array
        int[] count = new int[max+1];

        // count occurrences
        for(int i=0; i<arr.length; i++){
            count[arr[i]] = count[arr[i]]+1;
        }

        // reconstruct sorted array into original array
        int k = 0;
        for(int i=0; i<count.length; i++){
            int freq = count[i];          // how many times i occurs
            for (int j = 0; j < freq; j++) {
                arr[k] = i;               // put i in array
                k++;                       // move to next position
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
