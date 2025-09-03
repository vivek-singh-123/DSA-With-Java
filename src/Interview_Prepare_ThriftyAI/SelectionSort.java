package Interview_Prepare_ThriftyAI;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,5,2,20,9,10,15,10};
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int smallestIdx=i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[smallestIdx]){
                    smallestIdx=j;
                }
            }
            int temp=arr[smallestIdx];
            arr[smallestIdx]=arr[i];
            arr[i]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
