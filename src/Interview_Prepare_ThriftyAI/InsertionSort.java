package Interview_Prepare_ThriftyAI;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,5,2,20,9,10,15,10};
        int n=arr.length;


        for(int i=1; i<n; i++){
            int j=i;

            while (j>0 && arr[j] < arr[j-1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
