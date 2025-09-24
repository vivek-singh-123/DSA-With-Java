package PracticeQuestion;

import java.util.Arrays;

//Sort an array using bubble sort.
public class ImplementBubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,50,30,8,36,4,6};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
