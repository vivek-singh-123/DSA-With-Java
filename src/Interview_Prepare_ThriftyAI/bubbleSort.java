package Interview_Prepare_ThriftyAI;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,5,2,20,9,10,15,10};
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
