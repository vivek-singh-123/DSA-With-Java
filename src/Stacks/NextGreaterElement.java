package Stacks;

import java.util.Arrays;

public class NextGreaterElement {
    public static int[] greaterElement(int[] arr){
        int len = arr.length;
        int[] result = new int[len];

        for(int i=0; i<len; i++){
            result[i] = -1;
            for(int j=i+1; j<len; j++){
                if(arr[i] < arr[j]){
                    result[i] = arr[j];
                    break;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,8,5,7,10,9,4,6};
        int[] result = greaterElement(arr);
        //print
        System.out.println(Arrays.toString(result));
    }
}
