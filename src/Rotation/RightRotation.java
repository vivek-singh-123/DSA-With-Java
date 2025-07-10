package Rotation;

import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int len=arr.length;
        int k=3;
        System.out.println(Arrays.toString(arr));
        reverseOfAnArray(arr, len-k,len-1);
        reverseOfAnArray(arr, 0, len-k-1);
        reverseOfAnArray(arr, 0, len-1);

        System.out.println(Arrays.toString(arr));

    }
    public static void reverseOfAnArray(int[] arr, int startIndex, int endIndex){

        while(startIndex < endIndex){
            int temp=arr[startIndex];
            arr[startIndex]=arr[endIndex];
            arr[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
    }
}
