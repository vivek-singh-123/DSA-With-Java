package Sorting;

import java.util.Arrays;

public class SelectionSortAnotherExample {
    public static void main(String[] args) {
        int[] arr={2,7,11,4,15,3,10,8,9};

        for(int i=0; i<arr.length; i++){
            int minIndex=i;
            int minValue=arr[i];
            for(int j=i; j<arr.length; j++){
                if(arr[j]<minValue){
                    minValue=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

//t.c will be O(n^2)