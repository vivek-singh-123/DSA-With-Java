package Array;

import java.util.Arrays;

public class ReverseAnArrayTwoPointerConcept {
    public static void main(String[] args) {
        int[] arr={10,8,21,96,64,89,13,34,6};
        int len=arr.length;
        int i=0;
        int j=len-1;
        int swap;
        while(i<j){
            swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
            i++;
            j--;
        }
        System.out.println("Reversed an array: "+ Arrays.toString(arr));
    }
}
