package SlidingWindow;

import java.util.Arrays;

public class SortZeroesAndOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,0,1,0,0,1,0};
        int n =arr.length;

//        int count = 0;
//        for(int i=0; i<n; i++){
//            if(arr[i] == 0){
//                count++;
//            }
//        }
//
//        for(int i=0; i<n; i++){
//            if(i < count){
//                arr[i] = 0;
//            }else {
//                arr[i] = 1;
//            }
//        }
        int i=0, j=n-1;

        while (i<=j){
            if(arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
